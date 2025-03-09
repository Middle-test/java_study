package reflectdemo;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    //保存任意对象的静态方法
    public static void saveObject(Object obj) throws Exception {
        //注意：高级文件输出流，要实现追加写入，需要包装低级文件输出流，添加true关键字
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\git code\\java_study\\java_study\\javase_ai_project_pro\\reflect\\obj.txt",true));
        //obj 可能时学生，老师，狗
        //只有反射才能知道对象有多少字段
        //1、获取Class对象
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("=============="+simpleName+"==============");

        //2、获取所有字段
        Field[] fields = c.getDeclaredFields();

        //3、遍历所有字段
        for (Field field : fields) {
            //获取字段名称和字段值
            String fieldName = field.getName();
            field.setAccessible(true);
            Object fieldValue =field.get(obj)+"";
            System.out.println(fieldName + "=" + fieldValue);
            //保存到文件
            ps.println(fieldName + "=" + fieldValue);
        }
        ps.close();
    }
}
