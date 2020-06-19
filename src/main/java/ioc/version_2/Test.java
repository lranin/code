package ioc.version_2;

import ioc.version_1.ClassA;
import ioc.version_1.ClassB;
import ioc.version_1.ClassC;

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