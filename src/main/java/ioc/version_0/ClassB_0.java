package ioc.version_0;

/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassB_0 {
    private SpeakClass speakClass = new SpeakClass();

    public void speak(){
        speakClass.speak(ClassB_0.class.getName());
    }
}