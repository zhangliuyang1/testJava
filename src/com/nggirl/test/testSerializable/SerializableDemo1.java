package com.nggirl.test.testSerializable;


/**
 * 对象序列化机制（Object Serialization）是java语言内建的一中对象持久化方式，
 * 通过对象序列化，可以把对象的状态保存为字节数组，并且可以在有需要的时候将这个字节数组通过反序列化的方式再
 * 转换成对象。对象序列化可以很容易的在JVM中的活动对象和字节数组（流）之间转换
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/3/10  10:59
 */
public class SerializableDemo1 {
    public static void main(String[] args){
        //Initializes The Object
        User1 user = new User1();
        user.setName("zzz");
        user.setAge(18);
        System.out.println(user);

      /*  //Write Obj to File
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("E:/tempFile.txt"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(oos);
        }
        //Read Obj from File
        File file = new File("E:/tempFile.txt");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User1 newUser = (User1)ois.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(ois);
            try {
                FileUtils.forceDelete(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

}
