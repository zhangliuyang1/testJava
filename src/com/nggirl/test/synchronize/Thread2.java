package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  11:00
 */
public class Thread2 implements Runnable {
    private int threadId;
    private Object lock;

    public Thread2(int id,Object obj){
        this.threadId = id;
        this.lock = obj;
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
