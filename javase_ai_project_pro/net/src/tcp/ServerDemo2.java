package tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //目标：实现TCP通信下的多发多收：服务端开发
        //1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket serverSocket = new ServerSocket(9999);

        //2、阻塞式等待客户端连接，一旦有连接，返回socket对象
        Socket socket = serverSocket.accept();

        //3、获取输入流，读取客户端发送的数据
        InputStream is = socket.getInputStream();

        //4、把字节输入流包装成特殊字节输入流
        DataInputStream dis = new DataInputStream(is);

        while (true) {
            //5、读取数据
            String s = dis.readUTF();//等待读取数据
            System.out.println("收到信息:" + s);

            //6、获取客户端的ip和端口
            System.out.println("客户端的ip：" + socket.getInetAddress().getHostAddress());
            System.out.println("客户端的端口：" + socket.getPort());
            System.out.println("---------------------------");
        }

    }

}
