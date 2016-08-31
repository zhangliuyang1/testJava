package com.nggirl.test.strategyPattern.child;

import com.nggirl.test.strategyPattern.Duck;
import com.nggirl.test.strategyPattern.impl.FlyWithWings;
import com.nggirl.test.strategyPattern.impl.Quack;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:21
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    /*public void disPlay(){
        System.out.println("iam really Mallard duck");
    }*/

}
