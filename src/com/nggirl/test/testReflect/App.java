package com.nggirl.test.testReflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/3/8  16:45
 */
public class App {
    public static void main(String[] args){
        Class c = int.class;
        System.out.println(c.toString());
        Class c1 = String.class;
        System.out.println(c1.toString());

        /*Method[] methods = c1.getMethods();
        for (Method method : methods){
            System.out.println(method.toString());
        }*/
        Water water = new Water();
        Class c2 = Water.class;
        Field[] fields = c2.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
        Method[] methods = c2.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

    }
}
