package com.nggirl.test.thinkinjva.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  17:52
 */
public class SerializablePerson {
    private List<Person> initList() {
        List<Person> userList = new ArrayList<Person>();
        Person loginUser = new Person();
        loginUser.setName("sam");
        loginUser.setAge("30");
        loginUser.setPhoneNum("13333333333");
        loginUser.setPersonId("111111111111111111");
        userList.add(loginUser);
        loginUser = new Person();
        loginUser.setName("tonny");
        loginUser.setAge("31");
        loginUser.setPhoneNum("14333333333");
        loginUser.setPersonId("111111111111111111");
        userList.add(loginUser);
        loginUser = new Person();
        loginUser.setName("jim");
        loginUser.setAge("28");
        loginUser.setPhoneNum("15333333333");
        loginUser.setPersonId("111111111111111111");
        userList.add(loginUser);
        loginUser = new Person();
        loginUser.setName("Simon");
        loginUser.setAge("30");
        loginUser.setPhoneNum("17333333333");
        loginUser.setPersonId("111111111111111111");
        userList.add(loginUser);
        return userList;
    }


    private void serializableToFile(){
        List<Person> persons = new ArrayList<>();
        persons = initList();
        FileOutputStream fs = null;
        ObjectOutputStream os = null;
        try {
            fs = new FileOutputStream("C:\\Users\\Alisa\\Desktop\\ZLY\\hello3.txt");
            os = new ObjectOutputStream(fs);
            os.writeObject(persons);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
                fs.close();
            }catch (Exception e){

            }
        }
    }

    private void serializableFromFile(){
        FileInputStream fs = null;
        ObjectInputStream os = null;
        try {
            fs = new FileInputStream("C:\\Users\\Alisa\\Desktop\\ZLY\\hello3.txt");
            os = new ObjectInputStream(fs);
            List<Person> persons = (ArrayList<Person>)os.readObject();
            for (Person person : persons){
                System.out.println(person.getName() +"  "+person.getAge()+"  "+person.getPersonId() +"  "+ person.getPhoneNum());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        SerializablePerson person = new SerializablePerson();
        //person.serializableToFile();
        person.serializableFromFile();
    }
}
