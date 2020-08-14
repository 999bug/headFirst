package com.ncst.decorate;

/**
 * @Date 2020/8/12 16:16
 * @Author by LiShiYan
 * @Descaption
 */
public abstract class Beverage {
    String description = "Unknown Beverage ";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
