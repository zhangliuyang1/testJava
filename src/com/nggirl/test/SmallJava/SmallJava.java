package com.nggirl.test.SmallJava;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/12/9  18:24
 */
public class SmallJava {
    public static void main(String[] args){
//        Integer i = new Integer(0);
//        Integer j = new Integer(0);
//        System.out.println(i==j);
//        System.out.println(i>=j);
//        System.out.println(i<=j);
//        System.out.println(i!=j);
//
//        int a = Integer.MIN_VALUE + 1;
//        int b = a + 1;
//        System.out.println(a);
//        System.out.println(b);
//        /*if (a != 0 && a == -a){
//            System.out.println(a);
//        }*/

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        double m = formula.calculate(100);
        double n = formula.sqrt(16);
        System.out.println(n + m);
    }


}
