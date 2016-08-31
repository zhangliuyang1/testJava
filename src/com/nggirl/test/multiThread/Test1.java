package com.nggirl.test.multiThread;

import com.nggirl.test.TestThread.MyThread;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/23  14:16
 */
public class Test1 {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

}
