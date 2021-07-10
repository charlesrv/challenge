package com.kibernum.challenge.temperature;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kibernum.challenge.temperature.entities.ConsolidatedWeather;
import com.kibernum.challenge.temperature.entities.Location;
import com.kibernum.challenge.temperature.entities.LocationDetail;
import com.kibernum.challenge.temperature.entities.Weather;

@RestController
public class TemperatureController {
	private static final String BASEURL = "https://www.metaweather.com/api/location/";
	
	@GetMapping("/temperature/{city}")
	public Weather temperature(@PathVariable String city) {
		Weather response = new Weather();
		RestTemplate template = new RestTemplate();
		Location[] location = template.getForObject(
				BASEURL + "search/?query={city}",
				Location[].class,
				city);
		
		if (location != null && location.length > 0) {
			LocationDetail locationDetail = template.getForObject(
					BASEURL + "{woeid}",
					LocationDetail.class,
					location[0].getWoeid());

			if (locationDetail != null && !locationDetail.getConsolidatedWeather().isEmpty()) {
				LocalDateTime tmp = LocalDateTime.MIN;
				response.setCelsius(0);
				
				for (ConsolidatedWeather weather : locationDetail.getConsolidatedWeather()) {
					if (weather.getCreated().isAfter(tmp)) {
						tmp = weather.getCreated();
						response.setCelsius(weather.getTheTemp());
					}
				}
				response.setFahrenheit((float) ((response.getCelsius()*1.8)+32));
				
			}
		}
		
		return response;
	}
}
