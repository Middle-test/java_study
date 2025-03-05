package threademo;

public class ThreadDemo {
    public static void main(String[] args) {
        //目标：认识多线程，掌握创建线程的方式一：继承Thread类
        //4、创建一个线程对象
        MyThread t1 = new MyThread();
        //5、调用线程对象的start方法，启动线程,还是调用run方法执行的
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出:" + i);
        }
    }
}

//1、定义一个子类继承Thread类
class MyThread extends Thread {
    //2\重写Thread类的类方法
    @Override
    public void run() {
        //3、在run方法中编写需要执行的代码
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}
