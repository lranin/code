package ioc.annotation_version.instanceClass;


import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Singleton;
import ioc.annotation_version.pojo.PrototypeClass;
import ioc.annotation_version.pojo.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
@Singleton
public class ClassC {
    @Autowire
    private SingletonClass singletonClass;
    @Autowire
    private PrototypeClass prototypeClass;

    public void singletonSpeak(String word) {
        if (word == null) {
            singletonClass.speak(ClassC.class.getName());
        }
        singletonClass.speak("classC调用" + word);
    }

    public void prototypeSpeak(String word) {
        if (word == null) {
            prototypeClass.speak(ClassC.class.getName());
        }
        prototypeClass.speak("classC调用" + word);
    }
}