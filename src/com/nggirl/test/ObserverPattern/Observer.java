package com.nggirl.test.ObserverPattern;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  17:56
 */
public interface Observer {

    public void update(float temp,float humidity,float pressure);
}
