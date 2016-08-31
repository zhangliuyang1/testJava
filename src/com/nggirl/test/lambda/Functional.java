package com.nggirl.test.lambda;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/6/28  10:47
 */
public interface Functional {
    default String defaultMethod(){
        return " default implementation";
    }
}
