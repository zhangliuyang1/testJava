package com.nggirl.test.synchronize;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/24  11:19
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Thread(new Thread3(i)).start();
            Thread.sleep(1000);
        }
    }
}
