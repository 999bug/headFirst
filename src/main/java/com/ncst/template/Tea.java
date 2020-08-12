package com.ncst.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {


    @Override
    public void brew() {

        System.out.println("Steeping the tea");
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

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }


}
