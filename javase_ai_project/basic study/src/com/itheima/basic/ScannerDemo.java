package com.itheima.basic;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        printInfo();
    }

    //让用户键盘输入昵称和年龄，然后打印出来
    public static void printInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入昵称：");
        String nickName = sc.next();//next()方法用于读取一个字符串，读取的内容不包含换行符
        System.out.println("请输入年龄：");
        int age = sc.nextInt();//nextInt()方法用于读取一个整数，读取的内容不包含换行符
        System.out.println("昵称：" + nickName + " 年龄：" + age);
    }
}
