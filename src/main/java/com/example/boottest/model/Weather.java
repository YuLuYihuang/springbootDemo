package com.example.boottest.model;

/**
 * @author: xinchao.wang
 * @date: 2019-08-27 11:16
 * @description:
 */
public class Weather {
    private String date;
    private String week;
    private String img;
    private String weather;
    private String temperature;

    public String getDate() {
        return date;
    }

    public Weather setDate(String date) {
        this.date = date;
        return this;
    }

    public String getWeek() {
        return week;
    }

    public Weather setWeek(String week) {
        this.week = week;
        return this;
    }

    public String getImg() {
        return img;
    }

    public Weather setImg(String img) {
        this.img = img;
        return this;
    }

    public String getWeather() {
        return weather;
    }

    public Weather setWeather(String weather) {
        this.weather = weather;
        return this;
    }

    public String getTemperature() {
        return temperature;
    }

    public Weather setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public String toString() {
        return "Weather{" +
            "date=" + date +
            ", week='" + week + '\'' +
            ", img='" + img + '\'' +
            ", weather='" + weather + '\'' +
            ", temperature='" + temperature + '\'' +
            '}';
    }
}
