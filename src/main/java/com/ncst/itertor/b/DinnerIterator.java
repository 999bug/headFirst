package com.ncst.itertor.b;

/**
 * @Date 2020/8/10 16:57
 * @Author by LiShiYan
 * @Descaption
 */
public class DinnerIterator implements MyIterator {
    MenuItem[] items;
    int position = 0;

    public DinnerIterator(MenuItem[] items){
        this.items=items;
    }

    /**
     * 返回数组的下一个位置
     * @return
     */
    @Override
    public boolean hashNext() {
        //检查是否已经取得所有元素，如果还有元素继续遍历
        if (position>=items.length||items[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem=items[position];
        position+=1;
        return menuItem;

    }
}
