package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  10:51
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Thread(new Thread1(i)).start();
            Thread.sleep(1000);
        }
    }
}
