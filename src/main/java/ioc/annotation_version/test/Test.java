package ioc.annotation_version.test;

import ioc.annotation_version.assembly.ApplicationContext;
import ioc.annotation_version.instanceClass.ClassA;
import ioc.beanFactory_version.instanceClass.ClassA_2;
import ioc.beanFactory_version.instanceClass.ClassB_2;
import ioc.beanFactory_version.instanceClass.ClassC_2;
import javafx.application.Application;

/**
 * @author Ranin
 * @version Id: Test.java, v 0.1 2020/6/10 18:00 Ranin Exp $$
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        ClassA classA = (ClassA) applicationContext.getBean(ClassA.class);
        classA.speak("bababa");
    }
}