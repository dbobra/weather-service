package com.dbobr.service;

import com.dbobr.domain.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public static final String APP_ID = "&APPID=";
    private Logger log = LoggerFactory.getLogger(WeatherService.class);

    @Value("${api.base.url}")
    private String baseUrl;

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    public WeatherData getWeatherByCity(String cityName) {
        WeatherData weatherData = restTemplate.getForObject(baseUrl + cityName + APP_ID + apiKey, WeatherData.class);
        return weatherData;

    }
}
