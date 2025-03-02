package exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //目标：认识自定义异常
        try {
            saveAge(300);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    //只要年龄小于1岁或者大于200岁就是一个年龄非法异常
    public static void saveAge(int age) throws AgeException {
        if (age < 1 || age > 200) {
            throw new AgeException("年龄非法");
        }
        System.out.println("年龄合法");
        System.out.println("保存年龄" + age);
    }
}
