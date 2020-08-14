package com.ncst.decorate;

/**
 * @Date 2020/8/12 16:21
 * @Author by Li ShiYan
 * @Descaption 首选咖啡（星巴克咖啡名）
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="首选咖啡 house Blend";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
