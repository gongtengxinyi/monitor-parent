package org.monitor.thread.demo1;

import java.util.concurrent.CountDownLatch;

public class WorkThreadCountDownLatch implements Runnable {
    private CountDownLatch countDownLatch;
    private String userName;
    public WorkThreadCountDownLatch(CountDownLatch countDownLatch, String userName) {
        this.countDownLatch = countDownLatch;
        this.userName=userName;
    }
    public void run() {
        System.out.println(this.userName+"----i am work");
        try {
            Thread.sleep(5000);
            this.countDownLatch.countDown();
            System.out.println(this.userName+"----干完了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
