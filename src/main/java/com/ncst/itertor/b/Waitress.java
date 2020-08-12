package com.ncst.itertor.b;

import lombok.AllArgsConstructor;

/**
 * @Date 2020/8/10 17:13
 * @Author by LiShiYan
 * @Descaption
 */
@AllArgsConstructor
public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public void printMenu(){
        MyIterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        MyIterator dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("正餐菜单");
        printMenu(dinnerMenuIterator);

        System.out.println("早餐");
        printMenu(pancakeHouseMenuIterator);
    }

    public void printMenu(MyIterator iterator){
        while (iterator.hashNext()){
            MenuItem next = (MenuItem)iterator.next();
            System.out.println(next.getName()+next.getDesc()+next.getPrice());
        }
    }

}
