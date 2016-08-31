package com.nggirl.test.testSerializable;

import java.io.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/3/10  11:27
 */
public class ExternalizableDemo1 {
    public static void main(String[] args){
        User1 user1 = new User1();
        user1.setName("wwww");
        user1.setAge(16);
        System.out.println(user1);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempfile"));
            oos.writeObject(user1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //IOUtils.closeQuietly(oos);
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        File file = new File("tempfile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User1 user11 =(User1) ois.readObject();
            System.out.println(user11);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
