package com.ncst.itertor.e;


import java.util.Iterator;
import java.util.List;

/**
 * @Date 2020/8/10 17:13
 * @Author by LiShiYan
 * @Descaption
 */

public class Waitress {
    private List list;

    public Waitress(List list) {
        this.list = list;
    }

    public void printMenu() {
        for (Object o : list) {
            Menu next = (Menu) o;
            printMenu(next.createIterator());
        }
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = (MenuItem) iterator.next();
            System.out.println("\t" + next.getName() + next.getDesc() + next.getPrice());
        }
    }

}
