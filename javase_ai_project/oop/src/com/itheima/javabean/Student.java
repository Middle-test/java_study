package com.itheima.javabean;

public class Student {
    //1、私有成员变量
    private String name;
    private double chinese;
    private double math;

    //必须提供无参数构造器
    public Student() {

    }

    //提供有参数构造器（可选）
    public Student(String name,double chinese,double math){
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    //2、公开getter和setter方法(右键，generate)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
