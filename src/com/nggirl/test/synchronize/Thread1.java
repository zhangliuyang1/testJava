package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  10:48
 */
public class Thread1 implements Runnable {
    private int threadId;

    public Thread1(int id){
        this.threadId = id;
    }
    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread ID:"+this.threadId+":"+i);
        }
    }
}
