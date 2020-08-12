package com.ncst.observe;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Date 2020/8/11 19:36
 * @Author by LiShiYan
 * @Descaption
 */
@Data
@AllArgsConstructor
public class Weather {
    private float temperature;
    //湿度
    private float humidity;
    //压力
    private float pressure;
}
