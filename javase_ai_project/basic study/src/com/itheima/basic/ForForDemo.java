package com.itheima.basic;

public class ForForDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

}
