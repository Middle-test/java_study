package com.itheima.literal;

/**
 * 目标：掌握常见字面量的书写格式
 */
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }
    public static void printLiteral(){
        //直接输出常见的字面量
        //字符串字面量：双引号
        System.out.println("hello world")  ;
        //整数字面量：无符号整数
        System.out.println(123);
        //浮点数字面量：无符号浮点数
        System.out.println(3.14);
        //布尔字面量：true/false
        System.out.println(true);
        //字符字面量：单引号,里面只能有一个字符
        System.out.println('a');
        //掌握一些特殊字符的写法:\n换行符,\t（Tab缩进）,
        System.out.println("hello\nworld");
        System.out.println("hello\tworld");
    }
}
