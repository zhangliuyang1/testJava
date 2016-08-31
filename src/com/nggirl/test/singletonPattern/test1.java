package com.nggirl.test.singletonPattern;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/18  14:51
 */
public class test1 {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.display();
    }
}
