package executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) {
        //目标：通过线程池工具类：Executors，调用其静态方法直接得到线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);


    }
}
