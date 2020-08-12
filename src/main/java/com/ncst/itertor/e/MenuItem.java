package com.ncst.itertor.e;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Date 2020/8/10 16:24
 * @Author by LiShiYan
 * @Descaption 菜单选项
 */
@Data
@AllArgsConstructor
public class MenuItem {
    private String name;
    private String desc;
    //素菜
    private boolean vegetarian;
    private double price;


}
