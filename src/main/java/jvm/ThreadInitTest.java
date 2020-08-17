package jvm;

import java.util.concurrent.Executors;

/**
 * @author Ranin
 * @version Id: ThreadInitTest.java, v 0.1 2020/7/30 17:41 Ranin Exp $$
 */
public class ThreadInitTest {
    public static final ThreadPoolManager PROCESS_THREAD_POOL            = new ThreadPoolManager(
            Executors.newFixedThreadPool(20));
}