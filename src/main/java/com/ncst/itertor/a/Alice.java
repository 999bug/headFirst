package com.ncst.itertor.a;

import java.util.Iterator;
import java.util.List;

/**
 * @Date 2020/8/10 16:42
 * @Author by LiShiYan
 * @Descaption
 */
public class Alice {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeHouseMenu pancake=new PancakeHouseMenu();

        MenuItem[] menuItems = dinnerMenu.getMenuItems();
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }

        System.out.println("正餐餐厅");
        List dinnerMenus = pancake.getMenuItems();
        for (Object menu : dinnerMenus) {
            System.out.println(menu);
        }
    }
}
