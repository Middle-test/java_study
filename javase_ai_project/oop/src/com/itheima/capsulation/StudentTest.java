package com.itheima.capsulation;

public class StudentTest {
    public static void main(String[] args) {
        //搞清楚封装的设计思想，合理隐藏，合理暴露
        Student s1 = new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());
    }
}
