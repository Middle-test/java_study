package com.itheima.javabean;

public class StudentTest {
    public static void main(String[] args) {
        //搞清楚实体类
        //实体类的基本作用：创建它的对象，存取数据（封装数据）
        Student s1 = new Student("张三", 100, 90);
//        System.out.println(s1.getName());
//        System.out.println(s1.getChinese());
//        System.out.println(s1.getMath());

        //实体类在开发中的应用场景
        //创建一个学生的操作对象用来实现学生的数据处理
        StudentOperator operator = new StudentOperator(s1);
        operator.printTotalScore();
        operator.printAvgScore();
    }
}
