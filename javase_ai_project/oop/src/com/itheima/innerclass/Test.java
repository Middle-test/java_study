package com.itheima.innerclass;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚成员内部类的语法
        //成员内部类创建对象的格式
        Outer.Inner oi = new Outer().new Inner("张三");
        oi.show();
//        System.out.println(oi.getName());
        //成员内部类访问外部类的成员的特点
        //1、成员内部类可以直接访问外部类的静态成员,也可以访问外部类的实例成员
        //2、成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象 ：外部类名.this
        People.Heart ht = new People().new Heart();
        ht.beat();
    }
}


class People {
    private int heartBeat = 100;

    public class Heart {
        private int heartBeat = 200;

        public void beat() {
            int heartBeat = 300;
            System.out.println(heartBeat);//300
            System.out.println(this.heartBeat);//200
            System.out.println(People.this.heartBeat);//100
        }
    }
}