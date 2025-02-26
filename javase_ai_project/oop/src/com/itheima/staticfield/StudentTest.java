package com.itheima.staticfield;

public class StudentTest {
    public static void main(String[] args) {
        //认识static修饰的成员变量，特点，访问机制，应用场景
        //1、类名.静态变量名
        Student.name="张三";
        System.out.println(Student.name);

        //2、对象名.静态变量名
        Student s1=new Student();
        s1.name="李四";
        System.out.println(Student.name);

        //3、对象名.实例变量名
        s1.age=18;
        System.out.println(s1.age);

        //静态变量的应用
        new Student();
        new Student();
        new Student();
        System.out.println(Student.count);
    }
}
