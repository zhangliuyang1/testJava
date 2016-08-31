package com.nggirl.test;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by zhangliuyang on 2015/11/4 9:55.
 */
public class Iter {
    public static  void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for (Iterator iterator = list.iterator();iterator.hasNext();){
            String string =(String) iterator.next();
            System.out.println(string);
        }
        Iterator it = list.iterator();
        while (it.hasNext()){
           // String s1 = (String) it.next();
            String s = (String)it.next();
            System.out.println(s);
           // System.out.println(s1);
        }
    }


}
