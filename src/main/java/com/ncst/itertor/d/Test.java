package com.ncst.itertor.d;

import java.util.Iterator;

/**
 * @Date 2020/8/10 16:42
 * @Author by LiShiYan
 * @Descaption 使用java 自带的迭代器,新添加一个咖啡菜单
 */
public class Test {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeMenu pancake=new PancakeMenu();
        CafeMenu cafeMenu = new CafeMenu();


        Iterator iterator = dinnerMenu.createIterator();
        Iterator iterator1 = pancake.createIterator();
        Iterator iterator2 = cafeMenu.createIterator();

        Waitress waitress = new Waitress(pancake, dinnerMenu,cafeMenu);
        waitress.printMenu();

    }
}
