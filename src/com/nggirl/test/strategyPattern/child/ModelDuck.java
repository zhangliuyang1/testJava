package com.nggirl.test.strategyPattern.child;

import com.nggirl.test.strategyPattern.Duck;
import com.nggirl.test.strategyPattern.impl.FlyNoWay;
import com.nggirl.test.strategyPattern.impl.Quack;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:45
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void disPlay() {
        System.out.println("im a model duck");
    }
}
