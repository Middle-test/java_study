package com.itheima.string;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        //目标：认识字符串API
//        test1();
//        test2();
        test3();
    }


    public static void test1() {
        //只有“”给出的字符串对象放在字符串常量池中，相同内容只放一个
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println("=========================");
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);
    }

    public static void test2() {
        //字符串内容的比较：equals()，千万不能用==
        String correctAnswer = "abc";
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入答案：");
        while (true) {
            String answer = sc.next();
            if (correctAnswer.equals(answer)) {
                System.out.println("恭喜你，回答正确");
                return;
            } else {
                System.out.print("回答错误，请重新输入:");
            }
        }
    }

    public static void test3() {
        System.out.print("请您用手机号登录：");
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();
        System.out.print("系统显示以下手机号：");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.print(newPhone);
    }


}
