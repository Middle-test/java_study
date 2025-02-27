package com.itheima.extends5override;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal {
    //重写的规范：声明不变，重写实现
    @Override//方法重写的标志，要求方法名称及形参列表必须和被重写方法一致，否则报错，更加安全，可读性好
    public void cry() {
        System.out.println("猫在喵喵喵");
    }
}

class Animal {
    public void cry() {
        System.out.println("动物在哭");
    }
}