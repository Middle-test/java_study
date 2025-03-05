package synchronized_method;

public class ThreadSafeDemo {
    public static void main(String[] args) {
        //目标：线程同步的方式二演示：同步方法
        //1、设置一个账户类：用于创建小明和小红的共同账户，存10万元
        Account acc = new Account("123456", 100000);

        //2、设计线程类：创建小明和小红两个线程，模拟小明和小红同时取同一个账户取款10万
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }
}
