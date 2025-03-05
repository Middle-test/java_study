package io;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo {
    public static void main(String[] args) {
        //目标：搞清楚文件字符输出流的使用：写字符出去的流
        try (
                Writer fw = new FileWriter("file-io\\src\\txt2.txt"
                )
        ) {
            fw.write("hello");
            fw.write("\r\n");
            fw.write("world");
            fw.write("\r\n");
            fw.write(105);
            fw.write("\r\n");
            char[] strs = {'a', 'b', 'c'};
            fw.write(strs, 0, 2);
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
