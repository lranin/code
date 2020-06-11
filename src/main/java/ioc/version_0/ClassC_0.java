package ioc.version_0;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassC_0 {
    private SpeakClass speak = new SpeakClass();

    public void speak(){
        speak.speak(ClassC_0.class.getName());
    }
}