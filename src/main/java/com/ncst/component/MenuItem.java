package com.ncst.component;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Iterator;

/**
 * @Date 2020/8/11 10:18
 * @Author by LiShiYan
 * @Descaption
 */
@AllArgsConstructor

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;


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
    public void print() {
        String str=isVegetarian()?"(素食)":"";
        System.out.println("\t "+getName()+str+","+getPrice()+"--"+getDescription());

    }
    @Override
    public Iterator createIterator(){
        return  new NullIterator();
    }
}
