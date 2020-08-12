package com.ncst.component;

import java.util.Iterator;

/**
 * @Date 2020/8/11 11:24
 * @Author by LiShiYan
 * @Descaption
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
