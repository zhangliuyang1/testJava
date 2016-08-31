package com.nggirl.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  13:55
 */
public class ArrayTest1 {
    public static void main(String[] args){
      /*  int[] nums = {1,2,3,4};
        int[] prices;
        prices  = nums;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        prices[2] = 5;
        System.out.println(nums[2]);*/
        System.out.println(new Date(new Date().getTime()+60*60*1000));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat transDateSDF = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = new Date(sdf.parse(transDateSDF.format(new Date())+" "+"23:59:59").getTime()+1000);
            long time = date.getTime();
            System.out.println(sdf.format(date));
            System.out.println(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
