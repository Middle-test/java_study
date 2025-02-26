package com.itheima.object;

public class Student {
    String name;
    double chinese_score;
    double math_score;

    public void printAllScore() {
        System.out.println(name+"总成绩="+(chinese_score+math_score));
    }
    public void printAvgScore() {
        System.out.println(name+"平均成绩="+(chinese_score+math_score)/2);
    }
}
