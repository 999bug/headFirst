package com.ncst.itertor.b;

import java.util.List;

/**
 * @Date 2020/8/10 16:42
 * @Author by LiShiYan
 * @Descaption 改进a 包中使用两次遍历
 */
public class Test {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeHouseMenu pancake=new PancakeHouseMenu();

        Waitress waitress=new Waitress(pancake,dinnerMenu);
        waitress.printMenu();
    }
}
