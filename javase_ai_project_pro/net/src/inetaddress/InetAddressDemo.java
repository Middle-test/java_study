package inetaddress;

import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) {
        //目标：认识InetAddress获取本机IP对象和对方IP对象
        try {
            //1、获取本机IP对象
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

            System.out.println("---------------------------");

            //2、获取对方IP对象
            InetAddress ip2 = InetAddress.getByName("www.bilibili.com");
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            System.out.println("---------------------------");


            //3、判断本机是否与对方主机接通
            System.out.println(ip2.isReachable(5000));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
