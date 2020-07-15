package thread.wangwenjun.chapter1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author Ranin
 * @version Id: ConcurrencyTry.java, v 0.1 2020/7/14 10:51 Ranin Exp $$
 * 高并发编程第一章
 */
@Slf4j
public class ConcurrencyTry {
    private static void enjoyMusic() {
        while (true) {
        log.info("enjoy music");
        sleep(1);
        }
    }

    private static void readBook() {
        while (true) {
            System.out.println("read book");
            sleep(1);
        }
    }

    private static void sleep(int seconds) {
        if (seconds == 0) {
            seconds = 1;
        }
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(ConcurrencyTry::enjoyMusic, "音乐线程");
        thread.start();
//        thread.start();
        new Thread(ConcurrencyTry::readBook).start();
//        readBook();
//        sleep(20);
//        System.out.println("------------------------- main thread dead");
//        while (true) {
//            System.out.println(thread.getState());
//        }
    }
}