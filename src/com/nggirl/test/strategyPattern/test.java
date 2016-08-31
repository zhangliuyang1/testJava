package com.nggirl.test.strategyPattern;

import com.nggirl.test.strategyPattern.child.MallardDuck;
import com.nggirl.test.strategyPattern.child.ModelDuck;
import com.nggirl.test.strategyPattern.impl.FlyRockedPowered;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:35
 */
public class test {
    public static void main(String[] args){
       /* Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.disPlay();*/

        Duck model = new ModelDuck();
        model.disPlay();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
