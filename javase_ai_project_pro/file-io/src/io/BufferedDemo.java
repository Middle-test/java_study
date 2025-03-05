package io;

import java.io.*;

public class BufferedDemo {
    private static final String SRC_FILE = "F:\\视频\\剪映\\2月3日.mp4";
    private static final String DEST_FILE = "D:\\";

    public static void main(String[] args) {
        //目标：缓冲流，低级流的性能分析
        //1、使用低级字节流按一个一个字节
//        copyFile1(SRC_FILE,DEST_FILE); 太慢了，淘汰
        //2、使用低级字节流按字节数组
        copyFile2(SRC_FILE, DEST_FILE); //比较慢，还可以接受
        //3、使用缓冲流按一个一个字节
//        copyFile3(SRC_FILE,DEST_FILE); 太慢了，淘汰
        //4、使用缓冲流按字节数组
        copyFile4(SRC_FILE, DEST_FILE); //很快，推荐使用

    }

    private static void copyFile4(String srcFile, String destFile) {
        //拿系统当前时间
        long start = System.currentTimeMillis();
        try (
                //1、创建低级字节流
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "4.mp4");
                //2、创建缓冲流
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流按字节数组复制完成，耗时：" + (end - start) / 1000.0 + "秒");
    }

    private static void copyFile3(String srcFile, String destFile) {
        //拿系统当前时间
        long start = System.currentTimeMillis();
        try (
                //1、创建低级字节流
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "3.mp4");
                //2、创建缓冲流
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流按一个一个字节复制完成，耗时：" + (end - start) / 1000.0 + "秒");
    }

    private static void copyFile2(String srcFile, String destFile) {
        //拿系统当前时间
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "2.mp4");
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级字节流按字节数组复制完成，耗时：" + (end - start) / 1000.0 + "秒");
    }

    public static void copyFile1(String srcFile, String destFile) {
        //拿系统当前时间
        long start = System.currentTimeMillis();
        try (
                //1、创建低级字节流
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE + "1.mp4");
        ) {
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级字节流按一个一个字节复制完成，耗时：" + (end - start) / 1000.0 + "秒");
    }
}
