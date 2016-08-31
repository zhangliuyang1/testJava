package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  11:31
 */
public class Thread4 implements Runnable {

    private int threadId;

    public Thread4(int id){
        this.threadId = threadId;
    }

    @Override
    public void run() {
        taskHandler(threadId);
    }

    private static synchronized void taskHandler(int threadId){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread ID:"+threadId+":"+i);
        }
    }
}
