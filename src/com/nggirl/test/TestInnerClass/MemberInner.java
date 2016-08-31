package com.nggirl.test.TestInnerClass;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  18:00
 */
public class MemberInner {
    private int a = 1;
    private int b = 2;
    //定义一个成员内部类
    public class Inner2{
        private int  a =0;
        public void doSome(){
            System.out.println(a);//直接访问a，访问的内部类里的a
            System.out.println(MemberInner.this.b);//直接访问外部类对象

            //如何访问到外部类里的a？
            System.out.println(MemberInner.this.a);
        }
    }
    public static void main(String[] a){
        //先创建外部类的实例，再创建成员内部类的对象
        MemberInner mi = new MemberInner();
        MemberInner.Inner2 in = mi.new Inner2();
        in.doSome();
    }
}
