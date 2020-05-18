package com.example.boottest.mapper;

import java.util.List;

import com.example.boottest.model.Weather;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: WeatherMapper
 * @author: hj
 * @create: 2019-08-08 10:53
 **/

@Mapper
public interface WeatherMapper {


    List<Weather> findAll();

    List<Weather> getOneBydw(@Param("date") String date, @Param("week") String week);

    void insertWeather(Weather weather);

    void updateWeather(Weather weather);

    void deleteWeather(@Param("date") String date, @Param("week") String week);

}
