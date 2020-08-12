package com.ncst.observe;

/**
 * @Date 2020/8/11 21:54
 * @Author by LiShiYan
 * @Descaption
 */
public class ForecastDisplay implements DisplayElement,Observe {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registeObserver(this);
    }

    @Override
    public void update(Weather weather) {
        lastPressure = currentPressure;
        currentPressure = weather.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

}
