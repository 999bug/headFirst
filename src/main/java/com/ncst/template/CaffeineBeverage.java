package com.ncst.template;

/**
 * @Date 2020/8/12 11:06
 * @Author by LiShiYan
 * @Descaption
 */
public abstract class CaffeineBeverage {
    /**
     * 准备食谱，不让子类覆盖重写
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        //使用钩子
        if (customerWantsCondiments()) {
            addCondiments();
        }
        pourInCup();
    }

    public abstract void brew();

    public abstract void addCondiments();

    /**
     * 钩子
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
