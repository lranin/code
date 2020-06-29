package ioc.beanFactory_version.test;

import ioc.beanFactory_version.instanceClass.ClassA_2;
import ioc.beanFactory_version.instanceClass.ClassB_2;
import ioc.beanFactory_version.instanceClass.ClassC_2;

/**
 * @author Ranin
 * @version Id: Test.java, v 0.1 2020/6/10 18:00 Ranin Exp $$
 */
public class Test {

    public static void main(String[] args) {
        ClassB_2 b = new ClassB_2();
        ClassA_2 a = new ClassA_2();
        ClassC_2 c = new ClassC_2();

        a.speak("123");
        b.speak("234");
        c.speak("345");
    }
}