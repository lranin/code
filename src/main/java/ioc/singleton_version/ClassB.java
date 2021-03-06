package ioc.singleton_version;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassB {
    private SingletonClass singletonClass = SingletonClass.getInstance();

    public void speak(){
        singletonClass.speak(ClassB.class.getName());
    }
}