package com.nggirl.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalLong;

/**
 * lambda表达式（也成闭包）是整个java8发行版中最受期待的在java语言层面的改变，
 * lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中），或者把代码看成数据
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/6/28  10:23
 */
public class LamTest {

    public static void main(String[] args){
        List<String> strs = new ArrayList<>();
        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
        List<String> st = new ArrayList<>();
        st = Arrays.asList("a","b","d");
        st.sort((e1, e2) -> e2.compareTo(e1));
        st.forEach(e -> System.out.println(e));


        Arrays.asList("a","b","d").sort((e1,e2) -> {
                    int result = e1.compareTo(e2);
                    return result;
                }
            );
        Functional functional = DefaulableFactory.create(DefaultableImpl::new);
        System.out.println(functional.defaultMethod());

        functional = DefaulableFactory.create(OverrideableImpl::new);
        System.out.println(functional.defaultMethod());
    }
}
