package com.ncst.observe.impove;

/*
 * @Date 2020/8/11 19:06
 * @Author by LiShiYan
 * @Descaption 目前状况公告板
 */

import java.util.Observable;
import java.util.Observer;

public class StaticConDisplay implements Observer, DisplayElement {
    private float maxTmp;
    private float mintmp = 200;
    private float tempSum;
    private int numReadings;


    public StaticConDisplay(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTmp + "/" + mintmp);
    }





    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            float temperature = weatherData.getWeather().getTemperature();
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
}
