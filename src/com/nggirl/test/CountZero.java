package com.nggirl.test;

import java.math.BigDecimal;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/3/9  11:23
 */
public class CountZero {
    public static void main(String[] args){
        int x = 10000;
        int count = 0;
        while (x > 0){
            count = count + x/5;
            x = x/5;
        }
        System.out.println(count);
        System.out.println(2000/5);
    }
}
