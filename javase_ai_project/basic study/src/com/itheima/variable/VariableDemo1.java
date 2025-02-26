package com.itheima.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        //目标：认识变量
        printLiteral();
    }
    public static void printLiteral() {
        //定义变量：数据类型 变量名 = 数据值;
        int age = 18;
        System.out.println(age);
        //定义一个小数变量
        double score = 99.9;
        System.out.println(score);
        //定义一个字符变量
        char ch='A';
        System.out.println((char)(ch+32));
    }
}
