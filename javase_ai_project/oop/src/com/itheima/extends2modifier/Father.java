package com.itheima.extends2modifier;

public class Father {
    //1、private修饰的方法，只能在当前类中
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    //2、缺省修饰的方法，在当前类中，同一个包的其他类中
    void method() {
        System.out.println("method");
    }

    //3、protected修饰的方法，在当前类中，同一个包的其他类中，子类中，子类的子类中
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    //4、public修饰的方法，所有类中都可以访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.method();
        father.protectedMethod();
        father.publicMethod();
        father.privateMethod();
    }
}
