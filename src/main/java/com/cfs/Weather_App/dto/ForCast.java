package com.cfs.Weather_App.dto;

import java.util.ArrayList;
import java.util.List;

public class ForCast {

    public ArrayList<Forecastday> forecastday;

    public ArrayList<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }
}
