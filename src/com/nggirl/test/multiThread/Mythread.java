package com.nggirl.test.multiThread;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/23  14:25
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i < 10){
            System.out.println(this.getName()+"i的值"+i);
            i++;
        }
    }
}
