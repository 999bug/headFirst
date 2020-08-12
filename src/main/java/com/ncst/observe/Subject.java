package com.ncst.observe;

/**
 * @Date 2020/8/11 18:39
 * @Author by LiShiYan
 * @Descaption 主题接口
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observe 观察者
     */
    void registeObserver(Observe observe);

    /**
     * 删除观察者
     * @param observe 观察者
     */
    void removeObserve(Observe observe);

    /**
     * 当主题方法改变时，调用此方法，通知所有观察者
     */
    void notifyObserver();
}
