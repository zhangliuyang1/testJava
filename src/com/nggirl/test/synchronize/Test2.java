package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  11:07
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        for (int i = 0; i < 5; i++) {
            new Thread(new Thread2(i,object)).start();
            Thread.sleep(1000);
        }
    }
}
