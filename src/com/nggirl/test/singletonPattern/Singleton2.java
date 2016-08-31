package com.nggirl.test.singletonPattern;

/**
 * 单例模式-双重检查加锁
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/18  14:39
 */
public class Singleton2 {
    private volatile static Singleton2 singleton2;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (singleton2 == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton2.class){
                //再次检查实力是否存在，如果不存在才真正的创建实例
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public void display(){
        System.out.println("双重检查加锁");
    }
}
