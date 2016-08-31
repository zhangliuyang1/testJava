package com.nggirl.test;

import java.util.*;

/**
 * Created by zhangliuyang on 2015/11/3 9:53.
 */
public class test2 {
    public  static  void main(String[] args){
        Map<String,Map<String,Boolean>> map1 = new HashMap<String, Map<String, Boolean>>();
        Map<String,Boolean> map2 = new HashMap<String, Boolean>();
        map2.put("a",true);
        map2.put("b",true);
        map2.put("c",true);
        map2.put("d",false);
        map1.put("1",map2);
        for (String key:map1.keySet()){
           Set<String> set = map1.get(key).keySet();
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()){
                Object keye = iterator.next();
                if (map2.get(keye)){
                    System.out.println(keye);
                }
            }
        }

    System.setProperties((new Properties()));
      //  test1 t = new test1();
//        t.mapTest1();
//        t.mapTest2();
   //     t.mapTest3();
      //  t.setTest1();
       // t.listTest1();
    }
}
