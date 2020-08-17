package thread.wangwenjun;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ranin
 * @version Id: VolatileKeyWord.java, v 0.1 2020/7/16 17:35 Ranin Exp $$
 */
public class VolatileKeyWord implements Runnable {
    private int i = 0;
    public final static int constant = 10;

    public synchronized void setI() {
        while (i < 50) {
            i++;
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        List<Thread> threads = IntStream.range(1, 3)
                .mapToObj(n -> new Thread(new VolatileKeyWord(), "threadName:" + n))
                .collect(Collectors.toList());
        threads.forEach(Thread::start);
    }

    @Override
    public void run() {
//        setI(Integer.valueOf(Thread.currentThread().getName()));
        try {
            synchronized (new Object()) {

            setI();
            }
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }
}