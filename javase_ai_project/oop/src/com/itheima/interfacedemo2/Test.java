package com.itheima.interfacedemo2;

public class Test {
    public static void main(String[] args) {
        //目标：完成接口的小案例
        //1、定义一个学生类
        //2、准备学生数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("小明", '男', 100);
        allStudents[1] = new Student("小红", '女', 90);
        allStudents[2] = new Student("小花", '女', 80);
        allStudents[3] = new Student("小黄", '男', 70);
        allStudents[4] = new Student("小黑", '男', 60);
        allStudents[5] = new Student("小绿", '女', 50);
        allStudents[6] = new Student("小蓝", '女', 40);
        allStudents[7] = new Student("小紫", '女', 30);
        allStudents[8] = new Student("小青", '女', 20);
        allStudents[9] = new Student("小紫", '女', 10);

        //3、提供两套业务实现方案，支持实现解耦合：面向接口编程
        //定义一个接口：打印全班信息，打印平均分
        //定义第一套实现类，实现接口：打印全班信息，打印平均分
        //定义第二套实现类，实现接口：打印全班信息（男女人数），打印平均分（去掉最高分和最低分）
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
