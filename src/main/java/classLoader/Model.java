package classLoader;

/**
 * @author Ranin
 * @version Id: Model.java, v 0.1 2020/7/13 16:45 Ranin Exp $$
 */
public class Model {
    private int opValue = 1;

    private void setOpValue(){
        opValue = 100;
    }

    static int value = 10;
    static {
        System.out.println(value);
        value = 20;
    }

    public static void main(String[] args) {
        int theValue = 10;
    }
}