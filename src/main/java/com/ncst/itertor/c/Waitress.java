package com.ncst.itertor.c;


import java.util.Iterator;

/**
 * @Date 2020/8/10 17:13
 * @Author by LiShiYan
 * @Descaption
 */

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinnerMenu=dinnerMenu;
    }
    public void printMenu(){
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("正餐菜单");
        printMenu(dinnerMenuIterator);

        System.out.println("早餐");
        printMenu(pancakeHouseMenuIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem next = (MenuItem)iterator.next();
            System.out.println("\t"+next.getName()+next.getDesc()+next.getPrice());
        }
    }

}
