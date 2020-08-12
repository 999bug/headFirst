package com.ncst.observe;

import java.util.ArrayList;

/**
 * @Date 2020/8/11 18:51
 * @Author by LiShiYan
 * @Descaption
 */
public class WeatherData implements Subject {
    private ArrayList<Observe> observers;
    private  Weather weather;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registeObserver(Observe observe) {
        observers.add(observe);
    }


    @Override
    public void removeObserve(Observe observe) {
        //返回指定元素的第一次出现在这个列表中的索引，
        // 如果此列表中不包含的元素 返回-1，
        int index = observers.indexOf(observe);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    /**
     * 把状态告知每一个观察者
     */
    @Override
    public void notifyObserver() {
        for (Observe observe : observers) {
            observe.update(weather);
        }
    }

    /**
     * 更新时通知观察者
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(Weather weather){
        this.weather=weather;
        measurementsChanged();
    }

    public ArrayList<Observe> getObservers() {
        return observers;
    }
}
