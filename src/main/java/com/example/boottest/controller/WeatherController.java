package com.example.boottest.controller;

import java.util.List;

import com.example.boottest.mapper.WeatherMapper;
import com.example.boottest.model.Weather;
import com.example.boottest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @description: WeatherController
 * @author: hj
 * @create: 2019-08-23 14:15
 **/
@RestController
public class WeatherController {

    @Autowired
    private WeatherMapper weatherMapper;

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/listWeather", method = GET)
    public List<Weather> listWeather() {
        return weatherMapper.findAll();
    }

    @GetMapping(value = "/sqlSelect")
    public String testService() {
        return helloService.sqlPrint();
    }

}
