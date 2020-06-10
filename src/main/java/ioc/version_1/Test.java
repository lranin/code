package ioc.version_1;

/**
 * @author Ranin
 * @version Id: Test.java, v 0.1 2020/6/10 18:00 Ranin Exp $$
 */
public class Test {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.speak();
        b.speak();
        c.speak();
    }
}