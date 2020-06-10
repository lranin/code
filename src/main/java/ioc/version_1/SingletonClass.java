package ioc.version_1;

/**
 * @author Ranin
 * @version Id: SingletonClass.java, v 0.1 2020/6/10 17:45 Ranin Exp $$
 * 单例类
 */
public class SingletonClass {
    private String words = "the class invoke this :";
    private static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public void speak(String something) {
        System.out.println(words + something);
    }
}