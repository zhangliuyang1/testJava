package com.nggirl.test.TestInnerClass;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  17:54
 */
public class StaticInner {
    private static  int a = 8;
    int b = 9;
    //静态内部类
    public static  class Inner{
        //静态内部类可以访问外部类的静态成员，并且只能访问静态的
        public void test(){
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        //StaticInner.Inner si = new StaticInner.Inner();
        StaticInner.Inner si = new StaticInner.Inner();
        si.test();
    }
}
