package threademo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        //目标：线程的创建方式三：实现Callable接口，优势是可以获取线程执行完毕后的结果
        //3、创建一个Callable接口的实现类对象
        Callable<String> mc = new MyCallable(100);
        //4、把Callable对象封装成一个真正的线程任务对象FutureTask
        /**
         * FutureTask对象的作用
         *   1、本质是一个Runnable接口的线程任务对象，可以交给Thread线程对象处理
         *   2、可以获取线程执行完毕后的结果
         */
        FutureTask<String> ft = new FutureTask<String>(mc);
        //5、把FutureTask对象交给一个线程对象来处理
        Thread t1 = new Thread(ft);
        //6、启动线程
        t1.start();

        Callable<String> mc2 = new MyCallable(50);
        FutureTask<String> ft2 = new FutureTask<String>(mc2);
        Thread t2 = new Thread(ft2);
        t2.start();

        //7、获取线程执行完毕后的结果
        try {
            //如果主线程发现第一个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕后，再往下执行
            System.out.println(ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //如果主线程发现第二个线程还没有执行完毕，会让出CPU，等第二  个线程执行完毕后，再往下执行
            System.out.println(ft2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//1、定义一个实现类实现Callable接口
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2、实现call方法，定义线程任务
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程求和1-"+ n +"的结果是："+ sum;
    }
}
