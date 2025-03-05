package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //目标：完成多线程的综合小案例
        //红包雨游戏：某企业有100名员工，工号依次是1，2，3，4...到100
        //要求公司发出200个红包雨，其中小红包在[1-30]元之间，占比80%，大红包在[31-100]元之间，占比20%
        //分析：100个员工就是100个线程，来竞争200个红包
        List<Integer> redPackets = getRedPackets();
        //2、定义线程类，创建100个线程，竞争同一个集合
        for (int i = 0; i < 100; i++){
            new PeopleGetRedPacket(redPackets,"人"+i).start();
        }
    }


    //1、准备200个随机的红包返回，放到List集合中去返回
    public static List<Integer> getRedPackets() {
        Random r = new Random();
        List<Integer> redPackets = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            redPackets.add(r.nextInt(30) + 1);
        }
        for (int i = 0; i < 40; i++) {
            redPackets.add(r.nextInt(70) + 31);
        }
        return redPackets;
    }
}


