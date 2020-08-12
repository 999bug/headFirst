package com.ncst.itertor.c;

import java.util.Iterator;

/**
 * @Date 2020/8/10 16:42
 * @Author by LiShiYan
 * @Descaption 使用java 自带的迭代器
 */
public class Test {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeMenu pancake=new PancakeMenu();


        Iterator iterator = dinnerMenu.createIterator();
        Iterator iterator1 = pancake.createIterator();

        Waitress waitress = new Waitress(pancake, dinnerMenu);
        waitress.printMenu();
        int pow =(int) Math.pow(10, 2);
        System.out.println(pow);
    }
}
