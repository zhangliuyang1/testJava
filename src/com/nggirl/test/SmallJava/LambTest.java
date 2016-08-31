package com.nggirl.test.SmallJava;

import java.util.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/12/10  16:19
 */
public class LambTest {
    public static void main(String[] args){
        List<String> names = Arrays.asList("peter","anna","nike","tom");
  /*      Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });*/

        Collections.sort(names,(String a,String b) -> {
            return b.compareTo(a);
        });




        //Collections.sort(names);
        for (String str : names){
            System.out.println(str);
        }
        //Collections.sort(names,(a,b) -> a.compareTo(b));


        names.sort((a,b) -> b.compareTo(a));
        List<String> temp = new ArrayList<String>();
        names.forEach(e -> {

            temp.add(e);

        });

        temp.forEach(s -> System.out.println(s));
    }
}
