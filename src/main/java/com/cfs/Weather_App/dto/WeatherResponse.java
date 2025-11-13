package com.cfs.Weather_App.dto;

import org.springframework.stereotype.Service;


public class WeatherResponse {
    private String city;
    private String region;
    private String country;
    private String condition;
    private Double temperature;

    public WeatherResponse() {
    }

    public WeatherResponse(Double temperature, String condition, String country, String region, String city) {
        this.temperature = temperature;
        this.condition = condition;
        this.country = country;
        this.region = region;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
