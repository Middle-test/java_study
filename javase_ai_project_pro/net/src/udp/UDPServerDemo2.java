package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //目标：完成UDP通信多发多收：服务端开发
        //1、创建接收方对象，注册端口
        DatagramSocket socket = new DatagramSocket(8080);

        //2、创建数据包对象，用于封装接收到的数据
        byte[] data = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        while (true) {
            //3、接收数据，放到字节数组中
            socket.receive(packet);//阻塞式方法，如果没有数据，就一直等待

            //4、看看数据是否收到了
            System.out.println("收到了数据：" + new String(data, 0, packet.getLength()));

            //5、获取对方的IP地址和程序端口
            System.out.println("对方IP：" + packet.getAddress().getHostAddress());
            System.out.println("对方端口：" + packet.getPort());

            System.out.println("-----------------------------------------");
        }

    }
}