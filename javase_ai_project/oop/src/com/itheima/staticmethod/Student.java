package com.itheima.staticmethod;

public class Student {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 静态方法，用static修饰,属于类持有
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    //实例方法，不用static修饰，属于对象持有
    public void printPass() {
        System.out.println(this.score >= 60 ? "通过" : "挂科");
    }
}
