package reflectdemo;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造器执行了");
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("有参构造器执行了");
    }

    private Dog() {
        System.out.println("无参构造器执行了");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
