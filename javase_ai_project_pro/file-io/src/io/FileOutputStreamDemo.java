package io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //目标：学会使用文件字节输出流
        //1、创建文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("file-io\\src\\txt2.txt");//覆盖管道
//        OutputStream os =new FileOutputStream("file-io\\src\\txt2.txt",true); //追加管道
        //2、写入数据
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes());
        //3、写一个字节数组
        byte[] bytes = {99, 100, 101, 102};
        os.write(bytes);
        os.write("\r\n".getBytes());
        //4、写一个字节数组的一部分出去
        os.write(bytes, 1, 2);

        os.close();//关闭管道
    }
}
