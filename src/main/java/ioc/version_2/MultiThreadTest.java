package ioc.version_2;

/**
 * @author Ranin
 * @version Id: MultiThreadTest.java, v 0.1 2020/6/19 16:17 Ranin Exp $$
 */
public class MultiThreadTest {

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                test("第" + i + "次");
            }
        },"1号").start();
        Runnable t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                test("线程2:第" + i + "次");
            }
        },"2号");
        ((Thread) t).start();

    }

    private static void test(String i) {
//        ClassB_2 b = new ClassB_2();
//        ClassA_2 a = new ClassA_2();
//        ClassC_2 c = new ClassC_2();
        ClassD_2 d_2 = new ClassD_2();
//        a.speak(i);
//        b.speak(i);
//        c.speak(i);
    }
}