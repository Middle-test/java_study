package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        //目标：认识4种权限修饰符的修饰范围
        Father father = new Father();
        father.method();
        father.protectedMethod();
        father.publicMethod();
//        father.privateMethod();//报错
    }
}
