package io;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来
        //1、创建文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("file-io\\src\\txt1");

//        //2、读取文件中字节并输出
//        //定义一个变量记住每次读取的一个字节
//        int b;
//        while ((b = is.read()) != -1) {
//            System.out.print((char) b);
//        }
//        //每次读取一个字节的问题：性能较差，读取汉字输出一定会乱码
//
//        System.out.println();

        //定义一个数组用于每次读取字节
        byte[] buffer = new byte[3];
        //定义一个变量记住每次读取了多少个字节
        int len;
        while ((len = is.read(buffer)) != -1) {
            //每次读取的字节数，就是len
            String str = new String(buffer, 0, len);
            System.out.println(str);
        }
        //性能提升，但还是可能出现乱码
        is.close();//关闭管道
    }
}
