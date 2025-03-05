package File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        //目标：文件递归搜索
        //找出D盘下的QQ.exe的位置
        File dir = new File("D://");
        try {
            seacherFile(dir, "QQ.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件递归搜索
     *
     * @param dir      搜索的目录
     * @param fileName 搜索的文件名称
     */
    private static void seacherFile(File dir, String fileName) throws IOException {
        //1、判断极端情况
        if (dir == null || !dir.exists() || dir.isFile()) {
            return; //不搜索
        }

        //2、搜索当前目录下的一级文件或者文件夹对象
        File[] files = dir.listFiles();

        //3、判断当前目录下是否存在一级文件对象，存在才可以遍历
        if (files != null && files.length > 0) {
            //4、遍历一级文件对象
            for (File file : files) {
                if (file.isFile()) {
                    //5、判断当前一级文件对象是否是文件，是文件就进行判断
                    if (file.getName().equals(fileName)) {
                        System.out.println(file.getAbsolutePath());
                        Runtime r = Runtime.getRuntime();
                        r.exec(file.getAbsolutePath());
                    }
                } else {
                    //6、判断当前一级文件对象是否是文件夹，是文件夹就进行递归搜索
                    seacherFile(file, fileName);
                }
            }
        }

    }
}
