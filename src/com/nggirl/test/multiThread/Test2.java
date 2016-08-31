package com.nggirl.test.multiThread;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/23  14:26
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Mythread mythread = new Mythread();
        mythread.start();
        mythread.join(1);
//        mythread.sleep(1000);//这里sleep的是main线程，而非mythread线程
//        Thread.sleep(1000);
        for (int i=0;i<5;i++){
            System.out.println("main"+i);
        }
    }
}
