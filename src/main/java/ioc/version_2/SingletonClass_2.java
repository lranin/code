package ioc.version_2;

/**
 * @author Ranin
 * @version Id: SingletonClass_2.java, v 0.1 2020/6/10 17:45 Ranin Exp $$
 * 单例类
 */
public class SingletonClass_2 {
    //关注这个string放在局部变量和全局变量再虚拟机中的区别
    private String words = "the method invoke by :";
    private static SingletonClass_2 singletonClass_2 = new SingletonClass_2();

    private SingletonClass_2() {

    }

    public static SingletonClass_2 getInstance() {
        return singletonClass_2;
    }

    public void speak(String invoker) {
        System.out.println(words + invoker);
    }
}