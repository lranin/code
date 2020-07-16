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
    volatile int i = 0;

    public void setI(int x) {
         i = x +1;
    }

    public static void main(String[] args) {
        List<Thread> threads = IntStream.range(1, 3).mapToObj(n -> new Thread(new VolatileKeyWord(), "" + n)).collect(Collectors.toList());
        threads.forEach(Thread::start);
    }

    @Override
    public void run() {
        setI(Integer.valueOf(Thread.currentThread().getName()));
        try {
            TimeUnit.SECONDS.sleep(Integer.valueOf(Thread.currentThread().getName()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}