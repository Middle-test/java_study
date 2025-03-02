package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        //目标：掌握异常的处理方案1：底层异常都抛出去给最外层调用者，最外层捕获异常，记录异常信息，给用户提示。、
        System.out.println("========程序开始========");
        try {
            show();
            System.out.println("show方法执行完毕");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("show方法出现异常");
        }
        System.out.println("========程序结束========");
    }

    public static void show() throws Exception {
        //编译时异常：编译阶段报错，必须处理
        String str = "2025-03-02 14:03:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = sdf.parse(str);//编译时异常，提醒程序员这里很容易出问题
        System.out.println(date);

        InputStream is = new FileInputStream("d:/abc.txt");
    }
}
