package com.nggirl.test.TestInnerClass;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/9  15:42
 */
public class LocalInner {
    int a = 1 ;
    public void doSomething (){
        int b = 2;
        final  int c = 3;
        //定义一个局部内部类,像局部变量一样，不能被public，protected，private和static修饰
        class  Inner3{

            public void test(){
                System.out.println("hello world");
                System.out.println(a);
                //不能访问非final的局部变量。从内部类中访问局部变量，需要被声明为最终类型
               // System.out.println(b);
                System.out.println(c);
            }
        }

        new Inner3().test();
    }

    public static void main(String[] args){
        LocalInner inner = new LocalInner();
        inner.doSomething();
    }
}
