package threadapi;

public class ThreadApiDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚Thread类的Sleep方法（线程休眠）
        for (int i = 1; i <= 10; i++) {
            System.out.println("main线程：" + i);
            try {
                //让当前执行的线程进入休眠状态，知道时间到了才会继续执行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
