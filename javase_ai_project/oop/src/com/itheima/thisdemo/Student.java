package com.itheima.thisdemo;

public class Student {
    String name;
        //this是一个变量，代表当前对象
        //哪个对象使用这个方法，this就是哪个对象
        //this.name就是当前对象的name,避免与参数的name冲突
        public void printHobby(String name){
            System.out.println(this.name+"喜欢"+name);
        }

}
