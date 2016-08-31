package com.nggirl.test.lambda;

import java.time.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/6/28  19:15
 */
public class TestDateApi {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2016,6,23);
        System.out.println(date);
        System.out.println(date1);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime1 = LocalDateTime.now(Clock.systemUTC());
        System.out.println(dateTime1);
    }
}
