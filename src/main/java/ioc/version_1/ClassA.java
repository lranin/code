package ioc.version_1;

/**
 * @author Ranin
 * @version Id: ClassA.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassA {
    private SingletonClass singletonClass = SingletonClass.getInstance();

    public void speak(){
        singletonClass.speak(ClassA.class.getName());

    }
}