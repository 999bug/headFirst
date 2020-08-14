package com.ncst.decorate.io;

import java.io.*;

/**
 * @Date 2020/8/12 16:50
 * @Author by LiShiYan
 * @Descaption
 */
public class Test {
    public static void main(String[] args) throws Exception {
        int c;
        InputStream inputStream = new MyInputStream(new BufferedInputStream(new FileInputStream("File.txt")));
        while ((c = inputStream.read()) >= 0) {
            System.out.println((char)c);
        }
        inputStream.close();
    }
}
