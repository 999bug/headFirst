package com.ncst.decorate;

/**
 * @Date 2020/8/12 16:30
 * @Author by LiShiYan
 * @Descaption Milk 装饰者
 */
public class Milk extends CondimentDecorate {
    /**
     * beverage 被装饰者
     */
    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+":加牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
