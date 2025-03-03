package File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        //目标：创建File对象代表文件（目录），搞清楚其提供的对文件进行操作的方法
        //1、创建File对象，去获取某个文件的信息
        File f1 = new File("C:\\Users\\Azumate\\Pictures\\63858749115480.png");
        System.out.println(f1.length());

        //2、可以使用相对路径定位文件对象
        //相对路径不带盘符，默认到idea的工程目录下寻找文件
        File f2 = new File("file-io\\src\\txt1");
        System.out.println(f2.length());

        //3、创建对象代表不存在的文件
        File f3 = new File("file-io\\src\\txt2.txt");
        if (!f3.exists()) {
            System.out.println(f3.createNewFile());
        }

        //4、创建对象代表不存在的目录
        File f4 = new File("file-io\\src\\dir1");
        if (!f4.exists()) {
            System.out.println(f4.mkdir());//mkdir只能创建一个一级目录
        }

        //创建File对象代表存在的文件然后删除它
        File f5 = new File("file-io\\src\\txt2.txt");
        if (f5.exists()) {
            System.out.println(f5.delete());
        }

        //删除文件夹
        File f6 = new File("file-io\\src\\dir1");
        if (f6.exists()) {
            System.out.println(f6.delete());//只能删除空目录
        }

        //获取某个目录下的全部一级文件名
        File f7 = new File("F:\\视频\\Delta Force");
        String[] name = f7.list();
        for (String s : name) {
            System.out.println(s);
        }

        //获取某个目录下的全部一级文件对象
        File f8 = new File("F:\\视频\\Delta Force");
        File[] files = f8.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
