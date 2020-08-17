package thread.wangwenjun.chapter3;

import java.util.concurrent.TimeUnit;

/**
 * @author Ranin
 * @version Id: InterruptMethod.java, v 0.1 2020/7/15 16:01 Ranin Exp $$
 * Interrupt异常
 */
public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("balala  ");
                        TimeUnit.MINUTES.sleep(1);
                    } catch (Exception e) { //ignore the exception //here the interrupt flag will be clear. System. out. printf(" I am be interrupted ? %s\ n", isInter- ru- pted()); }
                        System. out. println(" Oh, i am be interrupted.");
                        System.out.println(this.getState());
//                        this.start();
                    }
                }
            }
        };
        thread.setName("测试");
//        thread.setDaemon(true);
        thread.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.printf(" -----------------------------------Thread is interrupted ? %s \n", thread.isInterrupted());
        thread.interrupt();
        Thread.interrupted();
//        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf(" Thread is interrupted ? %s \n", thread.isInterrupted());
    }
}
