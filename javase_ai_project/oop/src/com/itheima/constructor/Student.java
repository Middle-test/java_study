package com.itheima.constructor;

public class Student {
    String name;
    int age;
    char sex;

    //构造器：是一种特殊方法，不能有返回值，方法名与类名相同
    //1.无参数构造器
    public Student() {
        System.out.println("=========无参数构造器=========");
    }

    //2.有参数构造器
    public Student(String n, int a, char s) {
        name = n;
        age = a;
        sex = s;
    }

    public Student(String n) {
        System.out.println("=========有参数构造器=========");
    }

    public void printInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex);
    }
}

