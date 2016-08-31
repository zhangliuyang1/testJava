package com.nggirl.test.lambda;

import java.util.function.Supplier;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/6/28  11:01
 */
public interface DefaulableFactory {
    static Functional create(Supplier<Functional> supplier){
        return supplier.get();
    }
}
