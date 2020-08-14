package com.ncst.decorate;

/**
 * @Date 2020/8/12 16:24
 * @Author by LiShiYan
 * @Descaption Mocha 是一个装饰者
 */
public class Mocha extends CondimentDecorate {
    /**
     * 被装饰者
     */
    private Beverage beverage;

    /**
     * 把饮料当作构造器参数，再由构造器将此饮料记录在实例变量中
     *
     * @param beverage 被装饰者
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ":加 Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
