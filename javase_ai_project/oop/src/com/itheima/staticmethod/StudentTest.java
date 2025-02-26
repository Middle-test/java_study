package com.itheima.staticmethod;

public class StudentTest {
    public static void main(String[] args) {
        // 目标：认识static修饰和不修饰方法的区别
        //1、类名.静态方法
        Student.printHelloWorld();

        //2、对象名.静态方法
        Student s = new Student();
        s.printHelloWorld();

        //3、对象名.实例方法
        s.setScore(59.5);
        s.printPass();
    }
}
