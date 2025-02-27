package com.itheima.singleinstance;

//饿汉式单例类
public class A {
    //2、定义一个静态变量，保存唯一对象
    private static final A a = new A();

    //1、私有化构造器:确保单例类对外不能创建对象
    private A() {
    }

    public static A getInstance() {
        return a;
    }
}
