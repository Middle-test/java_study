package com.itheima.basic;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        test1();
    }

    //实现一个简单计算器，让用户输入两个数字，然后选择运算符号，最后输出结果
    public static void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.print("请选择运算符号(+,-,*,/)：");
        char op = sc.next().charAt(0);
        System.out.print(num1 + "" + op + "" + num2 + "=");
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("输入有误");
        }

    }
}
