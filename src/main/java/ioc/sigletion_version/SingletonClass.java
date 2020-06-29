package ioc.sigletion_version;

/**
 * @author Ranin
 * @version Id: SingletonClass_2.java, v 0.1 2020/6/10 17:45 Ranin Exp $$
 * 单例类创建对象
 */
public class SingletonClass {
    private String words = "the class invoke this :";
    private static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public void speak(String invoker) {
        System.out.println(words + invoker);
    }
}