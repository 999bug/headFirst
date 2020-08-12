package com.ncst.component.b;

import java.util.Iterator;

/**
 * @Date 2020/8/11 10:37
 * @Author by LiShiYan
 * @Descaption
 */
public class Waitress {
     MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent) {

        this.allMenus = menuComponent;
    }

    public void printMenu(){
        allMenus.print();
    }
    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("====素食菜单====");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }
}
