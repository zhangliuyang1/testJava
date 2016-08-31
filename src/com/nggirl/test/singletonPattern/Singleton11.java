package com.nggirl.test.singletonPattern;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/18  14:36
 */
public class Singleton11 {

    private static Singleton11 singleton11 = new Singleton11();

    private Singleton11() {

    }

    public synchronized static Singleton11  getInstance(){
        return singleton11;
    }
}
