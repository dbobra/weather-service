package com.dbobr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private Logger log = LoggerFactory.getLogger(WeatherService.class);

    public void getWeatherByCity(String cityName) {
        log.info("Inside service :: {} ", cityName);
    }
}
