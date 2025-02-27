package com.itheima.singleinstance;

public class Test {
    public static void main(String[] args) {
        //目标：认识单例设计模式
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1 == a2);

        System.out.println("============");

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1 == b2);

    }
}
