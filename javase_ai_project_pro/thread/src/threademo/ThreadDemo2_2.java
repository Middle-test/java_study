package threademo;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        //目标：使用Runnable接口的匿名内部类创建线程
        new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出:" + i);
                }
        }).start();
    }
}
