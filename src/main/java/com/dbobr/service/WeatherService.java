package com.dbobr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private Logger log = LoggerFactory.getLogger(WeatherService.class);

    @Autowired
    private RestTemplate restTemplate;

    public String getWeatherByCity(String cityName) {
        log.info("Inside service :: {} ", cityName);
        String result = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&APPID=23ea786b27f284b6ecd76e87150a8898", String.class);
        return result;

    }
}
