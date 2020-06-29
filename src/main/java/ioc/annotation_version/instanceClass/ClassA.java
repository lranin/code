package ioc.annotation_version.instanceClass;

import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.pojo.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
@ioc.annotation_version.annotation.Singleton
public class ClassA {
    @Autowire
    private SingletonClass singleton_Class_;

    public void speak(String word) {
        if (word == null) {
            singleton_Class_.speak(ClassA.class.getName());
        }
        singleton_Class_.speak("classA调用" + word);

    }
}