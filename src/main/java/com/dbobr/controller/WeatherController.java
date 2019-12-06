package com.dbobr.controller;

import com.dbobr.WeatherApp;
import com.dbobr.domain.WeatherData;
import com.dbobr.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private Logger log = LoggerFactory.getLogger(WeatherController.class);
    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/city")
    public WeatherData getWeatherByCity(@RequestParam("name") String cityName){
        log.info("Requested city {}", cityName);
        return weatherService.getWeatherByCity(cityName);
    }

}
