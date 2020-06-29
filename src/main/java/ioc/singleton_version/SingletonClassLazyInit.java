package ioc.singleton_version;

/**
 * @author Ranin
 * @version Id: SingletonClassLazyInit_2.java, v 0.1 2020/6/10 18:08 Ranin Exp $$
 */
public class SingletonClassLazyInit {
    private String words = "the class invoke this :";
    private static SingletonClassLazyInit singletonClassLazyInit;

    private SingletonClassLazyInit() {

    }

    public static SingletonClassLazyInit getInstance() {
        if (singletonClassLazyInit == null) {
            return new SingletonClassLazyInit();
        }
        return singletonClassLazyInit;
    }

    public void speak(String something) {
        System.out.println(words + something);
    }
}