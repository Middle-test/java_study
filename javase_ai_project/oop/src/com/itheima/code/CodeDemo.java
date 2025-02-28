package com.itheima.code;

import java.util.Arrays;

public class CodeDemo {
    public static String schoolName;
    public static String[] cards = new String[54];

    //静态代码块:由static修饰，属于类，与类一起优先加载，自动执行一次
    //基本作用：可以完成对类的静态资源的初始化
    static {
        System.out.println("静态代码块");
        schoolName = "黑马程序员";
        cards[0] = "3";
        cards[1] = "4";
        cards[2] = "5";
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cards));
    }
}
