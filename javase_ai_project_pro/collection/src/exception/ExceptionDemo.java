package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        //目标：认识异常的体系，搞清楚异常的基本作用
//        show();
        try {
            show2();
//        } catch (ParseException e) {
//            e.printStackTrace();//打印异常信息
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //定义一个方法认识运行时异常
    public static void show() {
        //运行时异常的特点：编译阶段不报错，运行时出错
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//数组越界异常

        //空指针异常
        String str = null;
        System.out.println(str.length());
    }

    public static void show2() throws ParseException, FileNotFoundException {
        //编译时异常：编译阶段报错，必须处理
        String str = "2025-03-02 14:03:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);//编译时异常，提醒程序员这里很容易出问题
        System.out.println(date);

        InputStream is = new FileInputStream("d:/abc.txt");
    }
}
