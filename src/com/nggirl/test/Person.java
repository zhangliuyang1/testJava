package com.nggirl.test;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  14:16
 */
public class Person {
    public int age;
    public int name;
    public Person(int age,int name){
        this.age = age;
        this.name = name;
    }
    {
        double a = 2.0;
    }
    double a = 2.2;

    public static void main(String[] args){
        Person p = new Person(1,2);
        System.out.println(p.a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != person.name) return false;
        return Double.compare(person.a, a) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + name;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
