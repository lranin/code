package ioc.version_2;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassA_2 {
    private SingletonClass_2 singletonClass = (SingletonClass_2) BeanFactory.getBeanByName("SingletonClass_2");


    public void speak() {
        singletonClass.speak(ClassA_2.class.getName());

    }
}