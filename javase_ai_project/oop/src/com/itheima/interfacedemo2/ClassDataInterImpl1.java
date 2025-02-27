package com.itheima.interfacedemo2;

import java.util.Arrays;

public class ClassDataInterImpl1 implements ClassDataInter {
    private Student[] students;//记住送进来的信息

    public ClassDataInterImpl1() {
    }

    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public void printAverageScore() {
        System.out.print("全班平均成绩为：");
        double allscore = 0;
        for (int i = 0; i < students.length; i++) {
            allscore += students[i].getScore();
        }
        System.out.println(allscore / students.length);
    }

    @Override
    public String toString() {
        return "ClassDataInterImpl1{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
