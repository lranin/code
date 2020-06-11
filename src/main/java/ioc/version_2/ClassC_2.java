package ioc.version_2;

import ioc.version_1.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassC_2 {
    private SingletonClass_2 singletonClass_2 = SingletonClass_2.getInstance();

    public void speak(){
        singletonClass_2.speak(ioc.version_1.ClassC.class.getName());
    }
}