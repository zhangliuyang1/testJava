package com.nggirl.test.TestThread;


/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/1/8  18:10
 */
public class TestThread {
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("运行结束");
        //System.out.println(Thread.currentThread().getName());
    }
}
