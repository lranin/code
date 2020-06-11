package ioc.version_2;

import ioc.version_1.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassB_2 {
    private SingletonClass singletonClass = SingletonClass.getInstance();

    public void speak(){
        singletonClass.speak(ioc.version_1.ClassB.class.getName());
    }
}