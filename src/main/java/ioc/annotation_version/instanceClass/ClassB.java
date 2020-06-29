package ioc.annotation_version.instanceClass;


import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Prototype;
import ioc.annotation_version.pojo.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
@Prototype
public class ClassB {
    @Autowire
    private SingletonClass singletonClass;


    public void speak(String word){
        if (word == null) {
            singletonClass.speak(ClassB.class.getName());
        }
        singletonClass.speak("classB调用" + word);
    }
}