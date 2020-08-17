package jvm;

import thread.wangwenjun.VolatileKeyWord;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ranin
 * @version Id: test.java, v 0.1 2020/7/30 17:43 Ranin Exp $$
 */
public class test {
    public static final long startTime = 1596103590000l;
    public static void main(String[] args) {
        System.out.println("123431234");
                    ThreadInitTest.PROCESS_THREAD_POOL.execute(new TemplateRunnable());
        List<Thread> threads = IntStream.range(1, 3)
                .mapToObj(n -> new Thread(()->{
//                    while (System.currentTimeMillis() != startTime) {
//
//                    }
                },""+n))
                .collect(Collectors.toList());
//        threads.forEach(Thread::start);
    }
}