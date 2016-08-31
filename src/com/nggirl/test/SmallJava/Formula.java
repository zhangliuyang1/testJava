package com.nggirl.test.SmallJava;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/12/10  15:31
 */
public interface Formula {
    public double calculate(int a);
    default  double sqrt(int a){
        return Math.sqrt(a);
    }
}
