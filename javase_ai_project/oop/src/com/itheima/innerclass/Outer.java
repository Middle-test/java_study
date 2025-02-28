package com.itheima.innerclass;

//外部类
public class Outer {
    public static String schoolName = "黑马程序员";
    private int age = 18;

    public static void test() {
        System.out.println("test...");
    }

    //成员内部类：无static修饰，属于外部类的对象持有的
    public class Inner {
        private String name;

        public Inner() {
        }

        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("show...");
            System.out.println(schoolName);
            System.out.println(age);
            test();
            System.out.println(this);
            System.out.println(Outer.this);
        }
    }
}
