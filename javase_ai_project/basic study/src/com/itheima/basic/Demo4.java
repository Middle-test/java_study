package com.itheima.basic;

public class Demo4 {
    public static void main(String[] args) {
        test1();
//          isPrime(6);
    }

    //找到1到100之间所有的素数并打印
    public static void isPrime(int num) {
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println(num);
        }
    }

    public static void test1() {
        for (int i = 1; i <= 100; i++) {
            isPrime(i);
        }
    }
}


