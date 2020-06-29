package ioc.annotation_version.instanceClass;

import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Prototype;
import ioc.annotation_version.pojo.PrototypeClass;
import ioc.annotation_version.pojo.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassD.java, v 0.1 2020/6/19 16:53 Ranin Exp $$
 */
@Prototype
public class ClassD {
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