package jvm;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Ranin
 * @version Id: ThreadPoolManager.java, v 0.1 2019/9/17 17:52 Ranin Exp $$
 */
@Slf4j
public class ThreadPoolManager {
    private ThreadPoolExecutor pool;

    public ThreadPoolManager(ExecutorService pool) {
        System.out.println(Thread.currentThread().getName());
        this.pool = (ThreadPoolExecutor) pool;
    }

    public void execute(Runnable runnable) {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[2];

        log.debug("调用线程池的方法---{}.{}[lineNumber:{}]", ste.getClassName(), ste.getMethodName(), ste.getLineNumber());
        log.info("当前线程池状态---最大线程数:{},当前线程数:{},活跃线程数:{},任务:{}", pool.getCorePoolSize(), pool.getPoolSize(),
            pool.getActiveCount(), pool.getCompletedTaskCount() + "/" + pool.getTaskCount());

        pool.execute(runnable);
    }
}