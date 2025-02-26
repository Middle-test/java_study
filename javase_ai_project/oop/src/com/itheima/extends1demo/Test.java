package com.itheima.extends1demo;

public class Test {
    public static void main(String[] args) {
        //目标：继承的基本使用
        //1、创建对象，封装老师数据
        //子类可以继承父类的非私有成员
        Teacher t1 = new Teacher();
        t1.setName("小美");
        t1.setSkill("Java");
        t1.setSex('女');
    }
}
