package threademo;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式2：实现Runnable接口
        //创建线程任务类的对象代表一个线程任务
        MyRunnable mr = new MyRunnable();
        //把线程任务对象交给一个线程对象来处理
        Thread t1 = new Thread(mr, "线程1");
        //启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出:" + i);
        }

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出:" + i);
        }
    }
}
