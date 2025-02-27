package com.itheima.extends6constructor;

public class Test2 {
    public static void main(String[] args) {
        //目标：子类构造器调用父类构造器的应用场景
        Teacher t = new Teacher("小明", "java", '男');
        System.out.println(t.getName());
    }
}
