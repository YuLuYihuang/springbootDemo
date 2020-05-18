package com.example.boottest.service;

import java.util.List;

import com.example.boottest.mapper.WeatherMapper;
import com.example.boottest.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String pr() { return "hello!"; }

    @Autowired
    public WeatherMapper weatherMapper;

    public String sqlPrint() {
        List<Weather> all = weatherMapper.findAll();
        return all.toString();
    }

    public String getOneBydw(String date,String week){
        return weatherMapper.getOneBydw(date,week).toString();
    }

    public Boolean insterWeather(Weather weather){
        weatherMapper.insertWeather(weather);
        return true;
    }

    public Boolean updateWeather(Weather weather){
        weatherMapper.updateWeather(weather);
        return true;
    }

    public Boolean deleteWeather(String date,String week){
        weatherMapper.deleteWeather(date,week);
        return true;
    }
}
