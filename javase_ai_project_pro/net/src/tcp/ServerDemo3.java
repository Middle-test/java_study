package tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //目标：实现TCP通信下的多发多收：服务端开发，监听多个客户端
        //1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            //2、调用accept方法，阻塞式等待客户端连接，一旦有连接，返回socket对象
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了:" + socket.getInetAddress().getHostAddress());
            //3、把这个客户端的socket对象交给一个线程处理
            new ServerReader(socket).start();
        }

    }

}
