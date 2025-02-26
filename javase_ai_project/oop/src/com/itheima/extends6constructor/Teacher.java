package com.itheima.extends6constructor;

public class Teacher extends People {
    private String skill;

    public Teacher(String name, String skill, char sex) {
        //调用父类构造器完成父类属性的初始化
        super(name,sex);
        this.skill=skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
