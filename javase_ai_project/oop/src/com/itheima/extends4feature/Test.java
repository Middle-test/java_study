package com.itheima.extends4feature;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}

class Father {
    static String name = "父类";
}

class Son extends Father {
    static String name = "子类";

    public void show() {
        String name = "局部变量";
        System.out.println(name);
        System.out.println(this.name);//子类
        System.out.println(super.name);//父类
    }

}
