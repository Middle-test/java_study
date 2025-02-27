package com.itheima.extends5override;

public class Test2 {
    public static void main(String[] args) {
        //目标：方法重写的常见应用场景：子类重写Object的toSpring方法，以便返回对象的内容
        Student s = new Student("小明", 18, '男');
        System.out.println(s);//com.itheima.override.Student@2f4d3709
        //注意1、直接输出对象，默认会调用Object的toString方法，返回对象的地址
        //注意2、输出对象的地址没有什么意义，更希望看到对象的内容，所以子类要重写Object的toString方法，
        // 以便返回对象的内容
    }
}

class Student {
    private String name;
    private int age;
    private char sex;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", sex=" + this.sex +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
