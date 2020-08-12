package com.ncst.observe.impove;


import java.util.Observable;

/**
 * @Date 2020/8/11 18:51
 * @Author by LiShiYan
 * @Descaption
 */
public class WeatherData extends Observable {
    private Weather weather;


    /**
     * 更新时通知观察者
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Weather weather){
        this.weather=weather;
        measurementsChanged();
    }

    public Weather getWeather() {
        return weather;
    }
}
