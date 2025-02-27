package com.itheima.extends6constructor;

public class Test3 {
    public static void main(String[] args) {
        //目标：理解this(...)调用兄弟构造器
        //创建对象，存储一个学生的数据
        Student s1 = new Student("小明", 20, '男');//调用三参数构造器
        Student s2 = new Student("小红", 19, '女', "清华大学");//调用四参数构造器
        System.out.println(s1);
        System.out.println(s2);

    }
}
