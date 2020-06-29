package ioc.beanFactory_version.instanceClass;

import ioc.beanFactory_version.BeanFactory;
import ioc.beanFactory_version.SingletonClass_2;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassA_2 {
    private SingletonClass_2 singletonClass = (SingletonClass_2) BeanFactory.getBeanByName("SingletonClass_2");


    public void speak(String word) {
        if (word == null) {
            singletonClass.speak(ClassA_2.class.getName());
        }
        singletonClass.speak("classA调用" + word);

    }
}