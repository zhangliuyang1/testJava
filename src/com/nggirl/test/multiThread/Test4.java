package com.nggirl.test.multiThread;

import java.util.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/23  16:16
 */
public class Test4 {
    /**
     * 找出英文短文里出现最高频率的单词同时把出现的频率次数也计算出来，请编程把printWordAndFrequecy补充完整并打印出如下预期结果：
     *
     * 单词【a】出现频率最高，频率是【5】次
     */
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Every human being has a basic instinct, to help each other out. ")
                .append("If a hiker gets lost in the mountains, people will coordinate a search. ")
                .append("If a train crashes, people will line up to give blood. ")
                .append("If an earthquake levels a city, people all over the world will send emergency supplies. ")
                .append("This is so fundamentally human that it is found in every culture without exception. ")
                .append("Yes, there are assholes who just do not care, ")
                .append("but they are massively outnumbered by the people who do.");

        printWordAndFrequecy(builder.toString());
    }

    public static void printWordAndFrequecy(String str) {
        String res = str.replace(",","").replace(".","");
        String a[] = res.split(" ");
        System.out.println(res);
        Map<String,Integer> result = new HashMap<String,Integer>();
        Integer n = 1;
        for (String s:a){
            if (!result.containsKey(s)){
                result.put(s,n);
            }
            if (result.containsKey(s)){
                result.put(s,result.get(s)+1);
            }

        }

        Integer max = 0;
        for (String s : result.keySet()){

            Integer temp = result.get(s);
            if (temp > max){
                max = temp;
            }
            System.out.println(s + ":" + result.get(s));
        }

        for (String s : result.keySet()) {
            if (result.get(s).equals(max) ) {
                System.out.println("单词【"+s+"】出现频率最高，频率是【"+max+"】次");
            }
        }
        List<String> list  = new ArrayList<>();
        Collections.addAll(list,a);
    }
}
