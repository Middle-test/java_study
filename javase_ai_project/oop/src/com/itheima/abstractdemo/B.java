package com.itheima.abstractdemo;

//一个类继承抽象类，必须重写抽象类的所有抽象方法
public class B extends A {
    @Override
    public void show() {
        System.out.println("B类重写了show方法");
    }
}
