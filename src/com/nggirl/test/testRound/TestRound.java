package com.nggirl.test.testRound;

import java.math.BigDecimal;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/1/26  15:28
 */
public class TestRound {
    public static void main(String[] args){
        BigDecimal price = new BigDecimal(100.79);
        BigDecimal cutcost = price.multiply(new BigDecimal(1).subtract(new BigDecimal(0.1).divide(new BigDecimal(10))))
                .setScale(0, BigDecimal.ROUND_HALF_UP);
        System.out.println(cutcost);
    }
}
