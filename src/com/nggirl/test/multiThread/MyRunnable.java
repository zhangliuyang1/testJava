package com.nggirl.test.multiThread;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/23  14:14
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000000){
            System.out.println(Thread.currentThread().getName()+"i的值"+i);
            i++;
        }

    }
}
