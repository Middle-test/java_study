package com.itheima.interfacedemo;

//接口：使用interface关键字修饰
public interface A {
    //JDK 8之前的接口中只能定义常量和抽象方法
    //1、常量默认会加上public static final修饰
    String SCHOOL_NAME = "黑马程序员";

    //2、抽象方法默认会加上public abstract修饰
    void run();

    String go();
}
