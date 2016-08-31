package com.nggirl.test.strategyPattern.impl;

import com.nggirl.test.strategyPattern.FlyBehavior;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:31
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("im flying");
    }
}
