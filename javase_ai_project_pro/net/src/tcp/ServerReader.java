package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //读取管道的消息
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

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("客户端断开连接" + socket.getInetAddress().getHostAddress());
        }
    }
}
