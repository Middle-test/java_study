package tcpdemo;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReader extends Thread {
    //Thread调用了Runnable接口
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //给当前对应的浏览器管道响应一个网页数据回去
            OutputStream os = socket.getOutputStream();
            //通过字节输出流包装写出去的数据给浏览器
            //把字节输出流转换成打印流
            PrintStream pw = new PrintStream(os);
            //写网页数据
            pw.println("HTTP/1.1 200 OK");
            pw.println("Content-Type:text/html;charset=utf-8");
            pw.println();
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<meta charset='utf-8'>");
            pw.println("<title>");
            pw.println("学习java");
            pw.println("</title>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h1 style='color:red;font-size=20px'>学习BS架构</h1>");
            pw.println("</body>");
            pw.println("</html>");
            pw.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("客户端断开连接" + socket.getInetAddress().getHostAddress());
        }
    }
}
