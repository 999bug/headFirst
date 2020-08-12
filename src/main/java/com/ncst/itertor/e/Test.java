package com.ncst.itertor.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Date 2020/8/10 16:42
 * @Author by LiShiYan
 * @Descaption 使用java 自带的迭代器,新添加一个咖啡菜单
 * waitress 代码变的更简洁
 */
public class Test {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeMenu pancake=new PancakeMenu();
        CafeMenu cafeMenu = new CafeMenu();

        List list=new ArrayList();
        list.add(dinnerMenu);
        list.add(pancake);
        list.add(cafeMenu);


        Waitress waitress = new Waitress(list);
        waitress.printMenu();

    }
}
