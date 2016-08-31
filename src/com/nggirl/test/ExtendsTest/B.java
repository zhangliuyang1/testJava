package com.nggirl.test.ExtendsTest;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  16:36
 */
public class B extends  A {

    @Override
    public void pri() {
        System.out.println("111");
    }
    public static  void main(String[] args){
        A a  = new A();
        A b = new B();
        B c = new B();
        a.pri();
        b.pri();
        c.pri();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
