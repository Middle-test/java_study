package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器
        //子类构造器必须调用父类的构造器，再执行自己的构造器
        Son son = new Son();
    }
}

class Father {
    public Father() {
        System.out.println("父类无参构造器");
    }

    public Father(int a) {
        System.out.println("父类有参构造器");
    }
}

class Son extends Father {
    public Son() {
        // super();//默认存在，写不写都有，调用父类无参构造器
        super(6);//指定调用父类有参构造器
        System.out.println("子类无参构造器");
    }
}