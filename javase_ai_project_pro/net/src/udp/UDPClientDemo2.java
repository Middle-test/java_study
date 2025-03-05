package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动");
        //目标：完成UDP通信多发多收：客户端开发
        //1、创建发送方对象
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            //2、创建数据包对象封装要发送的数据
            System.out.println("请输入要发送的内容：");
            String line = sc.nextLine();
            if ("exit".equals(line)) {
                System.out.println("客户端退出");
                socket.close();
                break;
            }
            byte[] data = line.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length,
                    InetAddress.getLocalHost(), 8080);

            //3、发送数据
            socket.send(packet);
        }


    }
}
