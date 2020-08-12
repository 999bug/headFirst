package com.ncst.component;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Date 2020/8/11 11:16
 * @Author by LiShiYan
 * @Descaption
 */
public class CompositeIterator implements Iterator {
    Stack stack=new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
       if (stack.empty()){
           return false;
       }else {
           Iterator peek = (Iterator) stack.peek();
           if (!peek.hasNext()){
               stack.pop();
               return hasNext();
           }
           else {
               return true;
           }
       }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator peek =(Iterator) stack.peek();
            MenuComponent next = (MenuComponent)peek.next();
            if (next instanceof  Menu){
                stack.push(((Menu) next).createIterator());
            }
            return next;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

