package com.ncst.itertor.b;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/8/10 17:02
 * @Author by LiShiYan
 * @Descaption
 */
public class PancakeIterator implements MyIterator {
    private ArrayList list;
    private int position = 0;

    public PancakeIterator(ArrayList list) {
        this.list = list;
    }

    //返回集合的下一个元素
    @Override
    public boolean hashNext() {
        if (position >= list.size()||list.get(position)==null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {

        MenuItem o =(MenuItem) list.get(position);
        position += 1;
        return o;
    }
}
