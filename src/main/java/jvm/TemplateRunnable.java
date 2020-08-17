package jvm;

import java.util.concurrent.TimeUnit;

/**
 * @author Ranin
 * @version Id: TemplateRunnable.java, v 0.1 2020/7/30 17:46 Ranin Exp $$
 */
public class TemplateRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("now,I`m running");
        try {
            TimeUnit.SECONDS.sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("now,I`m dead");
    }
}