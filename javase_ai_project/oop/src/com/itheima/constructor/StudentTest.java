package com.itheima.constructor;

public class StudentTest {
    //认识构造器
    public static void main(String[] args) {
        //创建对象时，会自动调用构造器
//        Student s1 = new Student();
//        Student s2 = new Student("张三");
        Student s3 = new Student("李四",20,'男');
        s3.printInfo();
    }
}
