package Demo;

import java.util.List;

//线程类
public class PeopleGetRedPacket extends Thread{
    private List<Integer> redPackets;
    public PeopleGetRedPacket(List<Integer> redPackets, String name) {
        super(name);
        this.redPackets = redPackets;
    }

    @Override
    public void run() {
        //100个线程，每个线程从红包列表中取走一个红包
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redPackets){
                if (redPackets.size() == 0) {
                    break;
                }
                //随机一个索引
                int index = (int) (Math.random() * redPackets.size());
                Integer money = redPackets.remove(index);
                System.out.println(name + "号" + "抢到了" + money + "元");
                if(redPackets.size() == 0){
                    System.out.println("活动结束");
                    break;
                }
            }
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
