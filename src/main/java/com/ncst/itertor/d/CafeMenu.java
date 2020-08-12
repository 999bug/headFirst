package com.ncst.itertor.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @Date 2020/8/11 9:21
 * @Author by LiShiYan
 * @Descaption
 */
public class CafeMenu implements Menu {
    private HashMap<String,MenuItem> map;

    public CafeMenu() {
        map = new HashMap<>();
        addItem("黑咖啡","香喷喷",false,8);
        addItem("摩卡","香喷喷",true,10);
        addItem("芝士咖啡","香喷喷",false,3);
        addItem("油条","好吃",false,2);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        map.put(menuItem.getName(),menuItem);
    }

    /**
     * 我们取到的是 值的迭代器 而不是整个hashMap 的迭代器
     * @return
     */
    @Override
    public Iterator createIterator(){
        return map.values().iterator();
    }
}
