package reflectdemo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    @Test
    public void getClassInfo() {
        //目标：获取类的信息
        //1、反射第一步：获取Class对象
        Class c = Student.class;
        System.out.println(c.getName());//类的全类名 com.reflectdemo.Student
        System.out.println(c.getSimpleName());//类的简单类名 Student
    }

    @Test
    public void getConstructorInfo() throws Exception {
        //2、获取类的构造器对象
        Class dog = Dog.class;
        //getConstructors()只能获取所有的公共构造器,
        // getDeclaredConstructors()能获取所有的构造器
        Constructor[] cons = dog.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + "(" + con.getParameterCount() + ")");
        }

        System.out.println("-------------------------------");

        //获取单个构造器
        Constructor con1 = dog.getDeclaredConstructor();//获取无参构造器
        System.out.println(con1.getName() + "(" + con1.getParameterCount() + ")");

        Constructor con2 = dog.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2.getName() + "(" + con2.getParameterCount() + ")");

        Constructor con3 = dog.getDeclaredConstructor(String.class);
        System.out.println(con3.getName() + "(" + con3.getParameterCount() + ")");

        //获取构造器的作用依然是创建对象
        //暴力反射，可以访问私有属性和方法
        con1.setAccessible(true);//绕过访问权限检查
        Dog d1 = (Dog) con1.newInstance();
        System.out.println(d1);
    }

    @Test
    public void getFiledInfo() throws Exception {
        //3、获取类的成员变量对象
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "(" + field.getType().getName() + ")");
        }

        System.out.println("-------------------------------");

        //获取单个成员变量对象
        Field field1 = c.getDeclaredField("name");
        System.out.println(field1.getName() + "(" + field1.getType().getName() + ")");
        Field field2 = c.getDeclaredField("age");
        System.out.println(field2.getName() + "(" + field2.getType().getName() + ")");

        System.out.println("-------------------------------");

        //获取成员变量的目的依然是取值和赋值
        Student s = new Student();
        field1.setAccessible(true);
        field2.setAccessible(true);
        field1.set(s, "小花");//s.setName("小花");
        field2.set(s, 18);//s.setAge(18);
        System.out.println(s);

        String name = (String) field1.get(s);//s.getName();
        System.out.println(name);
    }

    @Test
    public void getMethodInfo() throws Exception {
        //4、获取类的成员方法对象
        Class c = Student.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }

        System.out.println("-------------------------------");

        //获取单个成员方法对象
        Method method1 = c.getDeclaredMethod("study");
        System.out.println(method1.getName() + "(" + method1.getParameterCount() + ")");
        Method method2 = c.getDeclaredMethod("eat", String.class);
        System.out.println(method2.getName() + "(" + method2.getParameterCount() + ")");

        System.out.println("-------------------------------");

        //获取成员方法的作用依然是调用方法
        Student s = new Student();
        method2.setAccessible(true);
        method1.invoke(s);//唤醒对象s的study方法并执行s.study();
        method2.invoke(s, "饭");//唤醒对象s的eat方法并执行s.eat("饭");
    }
}
