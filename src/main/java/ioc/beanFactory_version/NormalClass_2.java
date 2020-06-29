package ioc.beanFactory_version;

/**
 * @author Ranin
 * @version Id: NormalClass_2.java, v 0.1 2020/6/11 18:16 Ranin Exp $$
 */
public class NormalClass_2 {
    private String words = "Normal Class------the method invoke by :";

    public void speak(String invoker) {
        System.out.println(words + invoker);
    }
}