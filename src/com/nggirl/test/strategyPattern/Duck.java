package com.nggirl.test.strategyPattern;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  15:11
 */
public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void swim() {

    }

    public void disPlay() {
        System.out.println("red");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
