package exception;

/**
 * 自定义的编译时异常
 * 1、继承Exception
 * 2、重写构造器
 * 3、抛出异常
 */
public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }

    public AgeException() {
    }
}
