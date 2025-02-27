package com.itheima.object;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "波妞";
        s1.chinese_score = 100;
        s1.math_score = 100;
        s2.name = "波仔";
        s2.chinese_score = 59;
        s2.math_score = 100;
        s1.printAllScore();
        s1.printAvgScore();
        s2.printAllScore();
        s2.printAvgScore();
    }
}
