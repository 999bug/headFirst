package com.ncst.component.b;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Date 2020/8/11 10:18
 * @Author by LiShiYan
 * @Descaption
 */


public class MenuItem extends MenuComponent {
    ArrayList list;
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
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
    public  double getPrice(){
        return price;
    }
    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void print() {
        String str=isVegetarian()?"(素食)":"";
        System.out.println("\t "+getName()+str+","+getPrice()+"--"+getDescription());

    }
    @Override
    public Iterator createIterator(){
        return  new NullIterator();
    }
}
