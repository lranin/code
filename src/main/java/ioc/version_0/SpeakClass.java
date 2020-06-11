package ioc.version_0;

/**
 * @author Ranin
 * @version Id: SpeakClass.java, v 0.1 2020/6/11 10:56 Ranin Exp $$
 */
public class SpeakClass {
    private String words = "the class invoke this :";

    public void speak(String invoker){
        System.out.println(words + invoker);
    }
}