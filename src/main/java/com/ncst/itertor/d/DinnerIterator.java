package com.ncst.itertor.d;

import java.util.Iterator;

/**
 * @Date 2020/8/10 16:57
 * @Author by LiShiYan
 * @Descaption 自己写 的迭代器
 */
public class DinnerIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerIterator(MenuItem[] items) {
        this.items = items;
    }

    /**
     * 返回数组的下一个位置
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        //检查是否已经取得所有元素，如果还有元素继续遍历
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    /**
     * 使用的是固定长度的数组，所以在调用时，我们将后面的所有元素往前移动一个
     * 位置
     */
    @Override
    public void remove() {
        if (position<=0){
            throw  new IllegalStateException("数组大小为空");
        }
        if (items[position-1]!=null){
            for (int i = position-1; i <(items.length-1); i++) {
                items[i]=items[i+1];
            }
            items[items.length-1]=null;
        }
    }
}
