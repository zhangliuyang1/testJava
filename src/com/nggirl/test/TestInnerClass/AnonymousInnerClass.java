package com.nggirl.test.TestInnerClass;

import java.util.Date;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/9  15:23
 */
public class AnonymousInnerClass {
    @SuppressWarnings("deprecation")
    public String getDate(Date date){
        return date.toLocaleString();
    }
    public static void main(String[] args){
        AnonymousInnerClass test = new AnonymousInnerClass();
        String str = test.getDate(new Date());
        System.out.println(str);
        System.out.println("-------------------");

        //使用匿名内部类
        String str2 = test.getDate(new Date(){

        });//使用了花括号，但是不填入内容，执行结果和上面完全一致。生成了一个继承Date类的子类对象
        System.out.println(str2);
        System.out.println("--------------------");

        //使用匿名内部类，并且重写父类的方法
        String str3 = test.getDate(new Date(){

            //重写父类中的方法
            @Override
            @Deprecated
            public String toLocaleString(){
                return  "hello:" + super.toLocaleString();
            }
        });
        System.out.println(str3);


    }


}
