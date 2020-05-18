package com.example.boottest.service;

import com.example.boottest.model.Weather;

public interface HelloService {

    String pr();

    String sqlPrint();

    String getOneBydw(String data,String week);

    Boolean insterWeather(Weather weather);

    Boolean updateWeather(Weather weather);

    Boolean deleteWeather(String date,String week);
}
