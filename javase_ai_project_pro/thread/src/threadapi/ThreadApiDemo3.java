package threadapi;

public class ThreadApiDemo3 {
    public static void main(String[] args) {
        //目标：搞清楚线程的join方法：线程插队
        MyThread2 t = new MyThread2();
        t.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出:" + i);
            if (i == 1) {
                try {
                    t.join();//插队
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出:" + i);
        }
    }
}
