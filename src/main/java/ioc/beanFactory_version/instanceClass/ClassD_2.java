package ioc.beanFactory_version.instanceClass;

import ioc.beanFactory_version.BeanFactory;
import ioc.beanFactory_version.NormalClass_2;

/**
 * @author Ranin
 * @version Id: ClassD.java, v 0.1 2020/6/19 16:53 Ranin Exp $$
 */
public class ClassD_2 {
    private NormalClass_2 normalClass = (NormalClass_2) BeanFactory.getBeanByName(NormalClass_2.class.getName());

    public void normalSpeak(String word) {
        if (word == null) {
            normalClass.speak(ClassC_2.class.getName());
        }
        normalClass.speak("classC调用" + word);
    }
}