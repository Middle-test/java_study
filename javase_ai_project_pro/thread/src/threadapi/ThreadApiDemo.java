package threadapi;

public class ThreadApiDemo {
    public static void main(String[] args) {
        //目标：认识多线程，掌握创建线程的方式一：继承Thread类
        Thread t1 = new MyThread();
        t1.setName("线程1");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread();
        t2.setName("线程2");
        t2.start();
        System.out.println(t2.getName());

        //哪个线程调用这个代码，这个m就拿到哪个线程
        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +"输出:" + i);
        }
    }
}
