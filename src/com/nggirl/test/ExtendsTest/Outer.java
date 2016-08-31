package com.nggirl.test.ExtendsTest;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  17:36
 */
public class Outer {
    String str = "hello world";
    public class Inner{
        public String getStr(){
            return str;
        }
    }
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner obj = outer.new Inner();
        System.out.println(obj.getStr());
    }
}
