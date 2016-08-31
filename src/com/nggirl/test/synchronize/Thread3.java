package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  11:15
 */
public class Thread3 implements Runnable {

    private int threadId;
    private static Object lock = new Object();

    public Thread3(int id){
        this.threadId = id;
    }
    @Override
    public void run() {
        synchronized (lock){
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread ID:"+this.threadId+":"+i);
            }
        }
    }
}
