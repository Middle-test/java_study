package com.itheima;

public class Demo2 {
    //完成斗地主的做牌和洗牌
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        String poker[] = new String[54];
        //准备4种花色和13种点数
        String colors[] = {"♥", "♠", "♣", "♦"};
        String numbers[] = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //遍历点数，再遍历花色
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[index++] = colors[j] + numbers[i];
            }
        }
        //添加大小王
        poker[index++] = "🃏";
        poker[index] = "👲";
        //打印牌
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();
        //洗牌
        for (int i = 0; i < poker.length; i++) {
            int index_temp = (int) (Math.random() * poker.length);
            String temp;
            temp = poker[i];
            poker[i] = poker[index_temp];
            poker[index_temp] = temp;
        }
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
    }
}
