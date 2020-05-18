package com.example.boottest.controller;

import com.example.boottest.model.Weather;
import com.example.boottest.service.HelloService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping("weather")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello",method = GET)
    public String hello(){
        return helloService.pr();
    }

    @GetMapping(value = "/sqlSel")
    public String sqlSel(){
        return helloService.sqlPrint();
    }

    @GetMapping(value = "/getOneBydw")
    public String getOneBydw(String date, String week){
        return helloService.getOneBydw(date,week);
    }

    @RequestMapping(value = "/sqlAdd",method = GET)
    public Boolean sqlAdd(Weather weather){
        return helloService.insterWeather(weather);
    }

    @RequestMapping(value = "/sqlInster",method = POST)
    public Boolean sqlInster(Weather weather){
        return helloService.insterWeather(weather);
    }

    @RequestMapping(value = "/sqlUpdate",method = POST)
    public Boolean sqlUpdate(Weather weather){
        return helloService.updateWeather(weather);
    }

    @RequestMapping(value = "/sqlDelete",method = POST)
    public Boolean deleteWeather(String date, String week){
        return helloService.deleteWeather(date,week);
    }

}