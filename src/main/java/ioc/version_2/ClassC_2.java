package ioc.version_2;

import ioc.version_1.SingletonClass;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassC_2 {
    private NormalClass_2 normalClass_2 =(NormalClass_2) BeanFactory.getSingletonByClassName(NormalClass_2.class.getName());

    public void speak(){
        normalClass_2.speak(ioc.version_2.ClassC_2.class.getName());
    }
}