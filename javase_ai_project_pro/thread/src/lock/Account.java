package lock;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {
    private String cardId;
    private double money;
    private final Lock lk = new ReentrantLock();

    public void drawMoney(double money) {
        //拿到当前取钱的人
        String name = Thread.currentThread().getName();
        lk.lock();
        try {
            //判断余额是否足够
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取走" + money + "元");
                this.money -= money;
                //更新余额
                System.out.println("余额为：" + this.money + "元");
            } else {
                System.out.println(name + "取钱失败，余额不足");
            }
        } finally {
            lk.unlock();
        }
    }
}
