package ioc.version_2;


/**
 * @author Ranin
 * @version Id: ClassA_0.java, v 0.1 2020/6/10 17:55 Ranin Exp $$
 */
public class ClassC_2 {
    private NormalClass_2 normalClass_2 = (NormalClass_2) BeanFactory.getSingletonByClassName(NormalClass_2.class.getName());

    public void speak(String word) {
        if (word == null) {
            normalClass_2.speak(ClassC_2.class.getName());
        }
        normalClass_2.speak("classC调用" + word);
    }
}