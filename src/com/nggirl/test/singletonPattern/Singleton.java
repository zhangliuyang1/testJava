package com.nggirl.test.singletonPattern;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/18  14:32
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
