package org.monitor.thread.demo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch:多线程控制工具类，用来控制线程等待，它可以让某一个线程等待知道倒计时结束，再开始执行
 */
public class CountDownLatchDemo {

    //实例化并指定计数个数
    private static CountDownLatch countDown = new CountDownLatch(3);
    public static void main(String[] args) throws Exception {
        System.out.println("===begin=====");
        ExecutorService exec = Executors.newFixedThreadPool(3);
        exec.submit(new WorkThreadCountDownLatch(countDown,"huahua"));
        exec.submit(new WorkThreadCountDownLatch(countDown,"qq"));
        exec.submit(new WorkThreadCountDownLatch(countDown,"dd"));
        //等待检查，等待三个线程都执行完成后，主线程才能继续执行
        countDown.await();
        System.out.println("====end=====");
        exec.shutdown();
    }
}

