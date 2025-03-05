package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动");
        //目标：完成UDP通信一发一收：客户端开发
        //1、创建发送方对象
        DatagramSocket socket = new DatagramSocket();

        //2、创建数据包对象封装要发送的数据
        byte[] data = "你好，我是客户端".getBytes();
        /**
         * public DatagramPacket(byte[] buf, int length,
         InetAddress address, int port)
         * 参数1：要发送的数据，字节数组
         * 参数2：发送的字节长度
         * 参数3：目标ip地址
         * 参数4：目标端口号
         */
        DatagramPacket packet = new DatagramPacket(data, data.length,
                InetAddress.getLocalHost(), 8080);

        //3、发送数据
        socket.send(packet);

        socket.close();

    }
}
