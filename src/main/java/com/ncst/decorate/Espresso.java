package com.ncst.decorate;

/**
 * @Date 2020/8/12 16:21
 * @Author by Li ShiYan
 * @Descaption 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="浓缩咖啡 espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
