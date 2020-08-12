package com.ncst.itertor.b;

/**
 * @Date 2020/8/10 16:33
 * @Author by LiShiYan
 * @Descaption 晚餐 正餐
 */
public class DinnerMenu {
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

    public MyIterator createIterator(){
        return  new DinnerIterator(menuItems);
    }
}
