package com.itheima.capsulation;

public class Student {
    String name;
    //如何隐藏：使用private关键字，只能在本类中直接访问
    private int age;
    private double chinese_score;
    private double math_score;

    //如何暴露：使用public修饰的get方法和set方法合理暴露
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return age;
    }

    public void setChinese_score(double chinese_score) {
        this.chinese_score = chinese_score;
    }

    public double getChinese_score() {
        return chinese_score;
    }

    public void setMath_score(double math_score) {
        this.math_score = math_score;
    }

    public double getMath_score() {
        return math_score;
    }

    //公开方法
    public void printAllScore() {
        System.out.println(name + "总成绩=" + (chinese_score + math_score));
    }

    public void printAvgScore() {
        System.out.println(name + "平均成绩=" + (chinese_score + math_score) / 2);
    }
}
