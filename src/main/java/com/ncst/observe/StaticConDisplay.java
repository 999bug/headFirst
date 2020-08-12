package com.ncst.observe;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * @Date 2020/8/11 19:06
 * @Author by LiShiYan
 * @Descaption 目前状况公告板
 */

public class StaticConDisplay implements Observe, DisplayElement {
    private Weather weather;
    private Subject weatherData;
    private float maxTmp;
    private float mintmp=200;
    private float tempSum;
    private int numReadings;


    public StaticConDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registeObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTmp + "/" + mintmp);
    }


    @Override
    public void update(Weather weather) {
        this.weather = weather;
        float temperature = weather.getTemperature();
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTmp) {
            maxTmp = temperature;
        }
        if (temperature < mintmp) {
            mintmp = temperature;
        }
        display();
    }


}
