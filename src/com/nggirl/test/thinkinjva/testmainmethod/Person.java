package com.nggirl.test.thinkinjva.testmainmethod;

import java.util.Objects;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/30  17:22
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private float wight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(person.height, height) != 0) return false;
        if (Float.compare(person.wight, wight) != 0) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (wight != +0.0f ? Float.floatToIntBits(wight) : 0);
        return result;
    }
}
