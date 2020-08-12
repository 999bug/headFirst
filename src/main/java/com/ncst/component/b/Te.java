package com.ncst.component.b;

/**
 * @Date 2020/8/11 10:40
 * @Author by LiShiYan
 * @Descaption
 */
public class Te {
    public static void main(String[] args) {
        MenuComponent menu = new Menu("餐厅", "只做中餐");

        MenuComponent menu1 = new Menu("粤菜", "甜甜");
        MenuComponent menu2 = new Menu("川菜", "辣辣");
        MenuComponent menu3 = new Menu("鲁菜", "咸味");

        MenuItem item1 = new MenuItem("宫保鸡丁", "好吃的不得了", false, 16);
        MenuItem item2 = new MenuItem("鱼香肉丝", "好吃的不得了", false, 19);
        MenuItem item3 = new MenuItem("拌豆皮", "好吃的不得了", true, 8);

        MenuItem item4 = new MenuItem("麻婆豆腐", "好吃的不得了", true, 14);
        MenuItem item5 = new MenuItem("水煮鱼", "好吃的不得了", false, 28);
        MenuItem item6 = new MenuItem("炒辣椒", "好吃的不得了", true, 10);


        MenuItem item7 = new MenuItem("清蒸大虾", "好吃的不得了", false, 36);
        MenuItem item8 = new MenuItem("煎饼", "好吃的不得了", true, 18);
        MenuItem item9 = new MenuItem("豆角焖饼", "好吃的不得了", true, 25);

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);

        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);

        menu3.add(item7);
        menu3.add(item8);
        menu3.add(item9);

        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);


        Waitress waitress = new Waitress(menu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
