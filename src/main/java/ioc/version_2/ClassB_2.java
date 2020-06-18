package ioc.version_2;



/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassB_2 {
    private SingletonClass_2 singletonClass =(SingletonClass_2) BeanFactory.getSingletonByClassName(SingletonClass_2.class.getName());

    public void speak(){
        singletonClass.speak(ioc.version_2.ClassB_2.class.getName());
    }
}