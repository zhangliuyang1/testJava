package com.nggirl.test.strategyPattern.impl;

import com.nggirl.test.strategyPattern.QuackBehavior;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:32
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
