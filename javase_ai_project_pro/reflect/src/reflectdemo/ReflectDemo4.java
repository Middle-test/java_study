package reflectdemo;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //目标：搞清楚反射的应用：做框架的通用技术
        Dog dog = new Dog("旺财", 3);
        SaveObjectFrameWork.saveObject(dog);

        Student s = new Student("张三", 18);
        SaveObjectFrameWork.saveObject(s);

        Teacher t = new Teacher("李四", 30, "java", 5000, "计算机", '男', "1001");
        SaveObjectFrameWork.saveObject(t);

    }
}
