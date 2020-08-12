package com.ncst.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/8/12 10:56
 * @Author by LiShiYan
 * @Descaption
 */
public class Coffee extends CaffeineBeverage {


    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String userInput = getUserInput().toLowerCase();
        return userInput.startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("would you like add some condiments?(y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer == null ? "no" : answer;
    }
}
