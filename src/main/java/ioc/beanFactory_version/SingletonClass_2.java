package ioc.beanFactory_version;

/**
 * @author Ranin
 * @version Id: SingletonClass_2.java, v 0.1 2020/6/10 17:45 Ranin Exp $$
 * 单例类
 */
public class SingletonClass_2 {
    //关注这个string放在局部变量和全局变量再虚拟机中的区别
    private String words = "Singleton Class----------the method invoke by :";
    private static SingletonClass_2 singletonClass_2 = new SingletonClass_2();

    private SingletonClass_2() {
        System.out.println("singleton no para private constructor");
    }

    private SingletonClass_2(String string) {
        System.out.println("private constructor :" + string);
    }

    private SingletonClass_2(String string, int i, boolean j) {
        System.out.println("private constructor :" + string);
    }

    public static SingletonClass_2 getInstance() {
        return singletonClass_2;
    }

    public void speak(String invoker) {
        System.out.println(words + invoker);
    }
}