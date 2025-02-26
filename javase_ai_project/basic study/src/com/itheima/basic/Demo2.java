package com.itheima.basic;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        test1();
    }
    public static void test1() {
        //随机生成一个1到100的数字
        int num = (int)(Math.random()*100)+1;
        //Math.random()生成[0,1)之间的随机小数
        // Math.random()*100生成[0,99)之间的随机数
        //方式2
        //Random r=new Random();
        //int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("请输入一个1到100的整数:");
            int guess = sc.nextInt();
            if(guess>num){
                System.out.println("猜大了");
                sum++;
            }else if(guess<num){
                System.out.println("猜小了");
                sum++;
            }
            else{
                System.out.println("恭喜你猜中了");
                sum++;
                System.out.println("你一共猜了"+sum+"次");
                break;
            }
        }

    }
}
