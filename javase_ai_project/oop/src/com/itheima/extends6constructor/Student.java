package com.itheima.extends6constructor;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String school;

    public Student() {
    }

    public Student(String name, int age, char sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.school = "北京大学";
        //this调用兄弟构造器
        //注意：super,this调用构造器必须用在构造器第一行,而且两者不能同时出现
        this(name, age, sex, "北京大学");
    }


    public Student(String name, int age, char sex, String school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", school='" + school + '\'' +
                '}';
    }
}
