package com.ncst.itertor.d;

import java.util.Iterator;

/**
 * @Date 2020/8/10 16:33
 * @Author by LiShiYan
 * @Descaption 晚餐 正餐
 */
public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("米饭", "香喷喷", false, 3);
        addItem("鱼香肉丝", "香喷喷", true, 18);
        addItem("水煮鱼", "香喷喷", false, 23);
        addItem("茶", "好喝", false, 8);
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("MENU is Full!!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    /**
     * 由于数组里没有自带的迭代器，所以我们要手写一个迭代器
     * @return
     */
    @Override
    public Iterator createIterator(){
        return  new DinnerIterator(menuItems);
    }
}
