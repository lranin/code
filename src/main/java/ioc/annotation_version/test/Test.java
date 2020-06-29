package ioc.annotation_version.test;

import ioc.annotation_version.annotation.Autowire;
import ioc.annotation_version.annotation.Singleton;
import ioc.annotation_version.assembly.ApplicationBeanContainer;
import ioc.annotation_version.instanceClass.ClassA;
import ioc.annotation_version.instanceClass.ClassB;
import ioc.annotation_version.instanceClass.ClassC;
import ioc.annotation_version.instanceClass.ClassD;

/**
 * @author Ranin
 * @version Id: Test.java, v 0.1 2020/6/10 18:00 Ranin Exp $$
 */
@Singleton
public class Test {
    @Autowire
    private static ClassA classA;
    @Autowire
    private static ClassB classB;
    @Autowire
    private static ClassC classC;
    @Autowire
    private static ClassD classD;


    public static void main(String[] args) {
        ApplicationBeanContainer applicationBeanContainer = new ApplicationBeanContainer();
        classA.speak("bababa");
        classB.speak("bababa");
        classC.singletonSpeak("bababa");
        classD.singletonSpeak("bababa");
        classC.prototypeSpeak("bababa");
        classD.prototypeSpeak("bababa");
    }
}