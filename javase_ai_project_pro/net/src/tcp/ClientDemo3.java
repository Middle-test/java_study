package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo3 {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动");
        //目标：实现TCP通信下的多发多收：客户端开发,支持多个客户端开发
        //1、常见Socket管道对象，请求与服务端的Socket链接，可靠链接
        Socket socket = new Socket("192.168.0.103", 9999);

        //2、从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        //3、特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入要发送的内容：");
            String line = sc.nextLine();
            if ("exit".equals(line)) {
                dos.writeUTF(line);
                dos.close();//关闭输入流
                socket.close();//关闭socket
                break;
            }
            dos.writeUTF(line);
            dos.flush();//刷新， 清空缓冲区
        }


    }
}
