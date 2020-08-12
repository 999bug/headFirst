package com.ncst.observe;

/**
 * @Date 2020/8/11 19:06
 * @Author by LiShiYan
 * @Descaption 目前状况公告板
 */
public class CurrentConDisplay implements Observe, DisplayElement {
    private Weather weather;
    private Subject weatherData;


    public CurrentConDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registeObserver(this);
    }


    @Override
    public void display() {
        System.out.println("当前天气状况公告板：\n" + "[温度]" + weather.getTemperature() + "[湿度]" + weather.getHumidity());
    }

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }
}
