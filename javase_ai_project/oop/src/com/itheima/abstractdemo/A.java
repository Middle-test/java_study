package com.itheima.abstractdemo;

// 抽象类
public abstract class A {
    private String name;
    private int age;

    // 抽象方法：必须用abstract修饰，没有方法体
    public abstract void show();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public A() {
    }


}
