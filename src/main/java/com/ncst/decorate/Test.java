package com.ncst.decorate;

/**
 * @Date 2020/8/12 16:32
 * @Author by LiShiYan
 * @Descaption
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage=new HouseBlend();

        Beverage beverage1=new Espresso();

        beverage=new Milk(beverage);
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        beverage=new Milk(beverage1);
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+"$"+beverage.cost());


    }
}
