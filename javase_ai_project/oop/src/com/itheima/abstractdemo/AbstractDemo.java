package com.itheima.abstractdemo;

public class AbstractDemo {
    public static void main(String[] args) {
        //目标：认识抽象类
        //抽象类的核心特点：有得有失（得到了抽象方法的能力，失去了创建对象的能力）
        //抽象类不能创建对象（重点）
//        A a = new A(); //报错
        //抽象类的使命就是被子类继承
        B b = new B();
        b.show();
        b.setAge(20);
        b.setName("小红");
        System.out.println(b.getName() + "," + b.getAge());
    }
}
