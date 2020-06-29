package ioc.annotation_version.instanceClass;

import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Prototype;
import ioc.annotation_version.annotation.Singleton;
import ioc.annotation_version.pojo.Singleton_01;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
@Singleton
public class ClassA {
    @Autowire
    private Singleton_01 singleton_01;

    public void speak(String word) {
        if (word == null) {
            singleton_01.speak(ClassA.class.getName());
        }
        singleton_01.speak("classA调用" + word);

    }
}