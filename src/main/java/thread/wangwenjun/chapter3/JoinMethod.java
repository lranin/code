package thread.wangwenjun.chapter3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ranin
 * @version Id: JoinMethod.java, v 0.1 2020/7/15 17:27 Ranin Exp $$
 * join方法
 */
public class JoinMethod {
    //④ main 线程 循环 输出
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1, 3).mapToObj(JoinMethod::create).collect(Collectors.toList());

        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                System.out.println( Thread.currentThread());
                //wait()方法-> 锁主体(被竞争的对象): thread,竞争线程: Thread.currentThread()
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
            threads.forEach(thread -> {
                try {
                    System.out.println("join");
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }

    //构造 一个 简单 的 线程， 每个 线程 只是 简单 的 循环 输出
    private static Thread create(int seq) {
        return new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "#" + i);
                shortSleep();
                if (i == 5 && Thread.currentThread().getName().equals("1")) {
                    shortSleep();
                    shortSleep();
                }

            }
        }, String.valueOf(seq));
    }

    private static void shortSleep() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}