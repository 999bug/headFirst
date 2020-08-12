package com.ncst.component;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Date 2020/8/11 10:25
 * @Author by LiShiYan
 * @Descaption
 */

public class Menu extends MenuComponent {
    ArrayList list = new ArrayList();

    private String name;
    private String description;

    public Menu(String name,String description){
        this.name=name;
        this.description=description;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)list.get(i);
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print(""+getName()+","+getDescription()+"------\n");
       //遍历所有菜单组件
        for (Object o : list) {
            MenuComponent next = (MenuComponent) o;
            next.print();
        }
    }
    @Override
    public Iterator createIterator(){
        return  new CompositeIterator(list.iterator());
    }
}
