package com.itheima.staticfield;

public class Student {
    //静态变量，由static修饰，属于类，只加载一份，可以被类和类的所有对象访问
    static String name;
    static int count=0;
    //实例变量，无static修饰属于对象，每个对象都有一份
    int age;
    public Student(){
        count++;
    }
}
