package com.dbobr.service;

import com.dbobr.config.AppProperties;
import com.dbobr.domain.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public static final String APP_ID = "&APPID=";
    private Logger log = LoggerFactory.getLogger(WeatherService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppProperties appProperties;


    public WeatherData getWeatherByCity(String cityName) {
        WeatherData weatherData = restTemplate.getForObject(appProperties.getBaseUrl() + cityName + APP_ID + appProperties.getApiKey(), WeatherData.class);
        return weatherData;

    }
}
