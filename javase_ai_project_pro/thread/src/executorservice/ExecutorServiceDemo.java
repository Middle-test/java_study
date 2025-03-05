package executorservice;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        //目标：创建线程池对象来使用
        //1、使用线程池的实现类：ThreadPoolExecutor 声明七个参数来创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3,5,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //2、使用线程池处理任务，看会不会复用线程
        Runnable target = new MyRunnable();
        pool.execute(target);//提交第一个任务，创建第一个线程
        pool.execute(target);//提交第二个任务，复用第二个线程
        pool.execute(target);//提交第三个任务，创建第三个线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);//排队队列满了
        pool.execute(target);//开始创建临时线程
        pool.execute(target);
        pool.execute(target);//临时线程满了，开始拒绝服务，抛出RejectedExecutionException异常

    }
}
