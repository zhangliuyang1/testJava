package com.nggirl.test;

import java.util.*;

/**
 * Created by Alisa on 2015/11/3.
 */
public class test1 {
    Map<String,String> map = new HashMap<String, String>();
    Set<String> set  = new HashSet<String>();
    public Map<String, String> getMap() {

        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void mapTest1(){
        map.put("1","b");
        map.put("2","c");
        map.put("3","a");
        //遍历map方法1
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            String value = map.get(key);
            System.out.print("key=" + key + "  ");
            System.out.println("value=" + value);
        }
    }
    //遍历map方法2
    public  void mapTest2(){
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
       Iterator  entries =map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry me = (Map.Entry)entries.next();
            Object key = me.getKey();
            String value = (String)me.getValue();
            System.out.print("key=" + key + "   ");
            System.out.println("value=" + value);
        }
    }
    //遍历map方法3
    public void mapTest3(){
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
    map.remove("1");

        for (String key : map.keySet()){

            String value = map.get(key);
            System.out.print("key = "+key+"  ");
            System.out.println("value = "+value+" ");
        }
    }
    public void setTest1(){
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String v = iterator.next();
            System.out.println("value = "+v);
        }
    }
    public void listTest1(){
        List<String>  list1 = new ArrayList<String>();
        list1.add("a");list1.add("b");list1.add("c");
        List<String> list2 = new LinkedList<String>();
        list2.add("d");list2.add("e");list2.add("f");
        List<String> list3 = new Vector<String>();
        for (int i=0;i < list1.size();i++){
            System.out.println(list1.get(i));
        }

        for (String str:list2){
            System.out.println(str);
        }
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
