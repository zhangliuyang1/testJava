package com.nggirl.test.testSerializable;

import java.io.*;

/**
 * 实现java.io.Serializable接口的序列化的类
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/3/10  10:57
 */
public class User1 implements Externalizable {
    private String name;
    private int age;

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
    @Override
    public String toString() {
        return "name:"+name+","+"age:"+age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        age = in.readInt();
    }
}
