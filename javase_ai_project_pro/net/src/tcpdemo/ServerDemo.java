package tcpdemo;

import tcp.ServerReader;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //目标：BS架构的原理理解
        //1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket serverSocket = new ServerSocket(8080);

        //创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 10, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            //2、调用accept方法，阻塞式等待客户端连接，一旦有连接，返回socket对象
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了:" + socket.getInetAddress().getHostAddress());
            //3、把这个客户端的socket对象包装成一个任务，交给线程池处理
            //线程对象可作为任务对象
            pool.execute(new ServerReader(socket));
        }

    }

}
