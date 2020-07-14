package thread.wangwenjun.chapter1;

/**
 * @author Ranin
 * @version Id: TemplateMethod.java, v 0.1 2020/7/14 17:39 Ranin Exp $$
 * 模板设计模式
 */
public class TemplateMethod {
    public final void print(String message) {
        System.out.println("################");
        wrapPrint(message);
        System.out.println("################");
    }

    protected void wrapPrint(String message) {
    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*" + message + "*");
            }
        };
        t1.print(" Hello Thread");
        TemplateMethod t2 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+" + message + "+");
            }
        };
        t2.print(" Hello Thread");
    }
}