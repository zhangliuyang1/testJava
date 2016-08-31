package com.nggirl.test.strategyPattern.impl;

import com.nggirl.test.strategyPattern.QuackBehavior;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:20
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("guagua");
    }
}
