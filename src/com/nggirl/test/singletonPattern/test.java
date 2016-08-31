package com.nggirl.test.singletonPattern;

import java.util.Calendar;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/18  14:48
 */
public class test {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.display();

        Calendar calendar = Calendar.getInstance();
    }
}
