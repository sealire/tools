package org.leesia.tools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: leesia
 * @Date: 2018/5/17 16:51
 * @Description: 线程池
 */
public class ExecutorTool {

    private static final int COUNT = 5555;

    public ExecutorService fixedThreadPool(int size) {
        return Executors.newFixedThreadPool(size);
    }

    public ExecutorService cachedThreadPool() {
        return Executors.newCachedThreadPool();
    }

    public ExecutorService singleThreadPool() {
        return Executors.newSingleThreadExecutor();
    }

    public ExecutorService scheduledThreadPool(int size) {
        return Executors.newScheduledThreadPool(size);
    }

    private static Runnable getThread(final int i, final long sleep) {
        return new Runnable() {
            public void run() {
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };
    }

    public void testFixedThreadPool(long sleep) {
        ExecutorService executorService = fixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 10; i++) {
            executorService.execute(getThread(i,sleep));
        }
        executorService.shutdown();
    }

    public void testCachedThreadPool(long sleep) {
        ExecutorService executorService = cachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(getThread(i, sleep));
        }
        executorService.shutdown();
    }

    public void testSingleThreadPool(long sleep) {
        ExecutorService executorService = singleThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(getThread(i, sleep));
        }
        executorService.shutdown();
    }

    public void testScheduledThreadPool(long sleep) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
        executorService.scheduleAtFixedRate(getThread(1,4000), 0, 2, TimeUnit.SECONDS);
    }

    public static void main(String args[]) {
//        new ExecutorTool().testFixedThreadPool(1000);
//        new ExecutorTool().testCachedThreadPool(1000);
//        new ExecutorTool().testSingleThreadPool(1000);
//        new ExecutorTool().testScheduledThreadPool(1000);
//        System.out.println(new ExecutorTool().getThreadSize());
        long sleep = 40;
        sleep += sleep * 0.1;
        System.out.println(sleep);
    }
}
