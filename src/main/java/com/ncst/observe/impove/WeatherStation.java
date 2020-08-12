package com.ncst.observe.impove;

/**
 * @Date 2020/8/11 19:12
 * @Author by LiShiYan
 * @Descaption
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conDisplay1 = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay conDisplay2= new ForecastDisplay(weatherData);

        StaticConDisplay conDisplay = new StaticConDisplay(weatherData);
        weatherData.setMeasurements(new Weather(80, 65, 30.4f));
        weatherData.setMeasurements(new Weather(82, 70, 29.2f));
        weatherData.setMeasurements(new Weather(78, 90, 29.2f));
        weatherData.setMeasurements(new Weather(58, 90, 29.2f));

        //conDisplay.display();
    }
}
