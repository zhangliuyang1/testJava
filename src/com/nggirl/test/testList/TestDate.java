package com.nggirl.test.testList;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/1/20  14:45
 */
public class TestDate {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Calendar date  = Calendar.getInstance();
        System.out.println(date);
        System.out.println(Integer.MAX_VALUE);
    }
}
