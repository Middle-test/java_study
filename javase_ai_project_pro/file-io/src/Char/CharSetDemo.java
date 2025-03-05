package Char;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //认识字符编码和解码
        //1、编码
        String str = "我爱中国666";

//        byte[] bytes = str.getBytes(); 默认是使用UTF-8编码
        byte[] bytes = str.getBytes("GBK"); //指定GBK编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //2、解码
//        String str2 = new String(bytes); 报错，默认是UTF-8解码
        String str2 = new String(bytes, "GBK");
        System.out.println(str2);
    }
}
