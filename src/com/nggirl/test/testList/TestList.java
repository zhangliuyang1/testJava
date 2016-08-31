package com.nggirl.test.testList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/1/20  10:23
 */
public class TestList {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        List<String> list1 = null;
        list.add("zzz");
        list.add("lll");
        System.out.println(list);
        System.out.println(list1);
    }
}
