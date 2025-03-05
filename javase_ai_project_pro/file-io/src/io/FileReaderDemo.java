package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) {
        //目标：掌握文件字符输入流读取字符内容到程序中来
        try (
                Reader fr = new FileReader("file-io\\src\\txt1")
        ) {
            //定义一个字符数组，每次读取多个字符
            char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                //每次读取的字节数，就是len
                System.out.print(new String(buffer, 0, len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
