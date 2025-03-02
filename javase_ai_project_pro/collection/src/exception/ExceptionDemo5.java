package exception;

import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        //目标：掌握异常的处理方案2：捕获异常对象，尝试重新修复
        System.out.println("========程序开始========");

        while (true) {
            try {
                double price = userInputPrice();
                System.out.println("价格是：" + price);
                break;
            } catch (Exception e) {
                System.out.println("价格输入有误，请重新输入！");
            }
        }

        System.out.println("========程序结束========");
    }

    public static double userInputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入价格：");
        double price = sc.nextDouble();
        return price;
    }
}
