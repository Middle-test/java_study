package com.itheima.basic;

public class MethodDemo {
    public static void main(String[] args) {
        //目标:掌握方法的定义和调用
        System.out.println(getSum(10, 20));
        //目标：掌握方法的重载
        System.out.println(getSum(10, 20, 30));
        System.out.println(getSum(10.1, 20.2));
    }

    //定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a, int b) {
        return a + b;
    }

    //方法的重载
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}



