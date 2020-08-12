package com.ncst.observe.old;

/**
 * @Date 2020/8/11 18:40
 * @Author by LiShiYan
 * @Descaption 观察者
 */
public interface Observe {

    /**
     * 当气象观测值改变时，主题会把这些当作参数传给观察者
     */
    void update(Weather weather);
}
