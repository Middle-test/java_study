package io;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        //目标：复制文件，掌握资源的新方式try-with-resources
        //源文件：C:\Users\Azumate\Pictures\63858749115480.png
        //目标文件：D:\new.jpg
        copyFile("C:\\Users\\Azumate\\Pictures\\63858749115480.png", "D:\\new.jpg");
    }

    private static void copyFile(String oldPath, String newPath) {
        try (
                //这里只能放置资源对象，用完后自动调用其close方法关闭
                InputStream is = new FileInputStream(oldPath);
                OutputStream os = new FileOutputStream(newPath);
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
