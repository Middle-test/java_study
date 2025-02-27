package com.itheima.interfacedemo2;

import java.util.Arrays;

public class ClassDataInterImpl2 implements ClassDataInter {
    private Student[] students;

    public ClassDataInterImpl2() {
    }

    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        int maleCount = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            if (students[i].getSex() == '男') {
                maleCount++;
            }
        }
        System.out.println("男学生人数为：" + maleCount + "\t女生人数为：" + (students.length - maleCount));
    }

    @Override
    public void printAverageScore() {
        //实现打印平均分(去掉最高分和最低分)
        System.out.println("全班平均成绩为：");
        double allscore = 0;
        double maxscore = students[0].getScore();
        double minscore = students[0].getScore();
        for (int i = 0; i < students.length; i++) {
            allscore += students[i].getScore();
            if (students[i].getScore() > maxscore) {
                maxscore = students[i].getScore();
            } else if (students[i].getScore() < minscore) {
                minscore = students[i].getScore();
            }
        }
        System.out.println(allscore / students.length);
        System.out.println("最高成绩为：" + maxscore);
        System.out.println("最低成绩为：" + minscore);
    }

    @Override
    public String toString() {
        return "ClassDataInterImpl2{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
