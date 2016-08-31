package com.nggirl.test.multiThread;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/23  15:15
 */
public class Test3 {
    public static void main(String[] args){
        Mythread t1 = new Mythread();
        Thread t2 = new Thread(new MyRunnable());

        t2.setDaemon(true);

        t2.start();
        t1.start();
    }
}
