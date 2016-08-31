package com.nggirl.test.lambda;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/6/28  10:56
 */
public class OverrideableImpl implements Functional {
    @Override
    public String defaultMethod() {
        return "Overriden implementation";
    }
}
