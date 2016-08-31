package com.nggirl.test.thinkinjva.IO;

import java.io.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  15:44
 */
public class OutputStreamDemo {

    public void writeWithByte(){

        String fileName = "C:\\Users\\Alisa\\Desktop\\ZLY\\hello.txt";
        OutputStream out = null;
        File f = new File(fileName);
        try {
            out = new FileOutputStream(f,true);
            String str = "I have a dream ";
            byte[]  b = str.getBytes();
            out.write(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null){
                    out.close();
                    out = null;
                }
            }catch (Exception e){

            }
        }
    }


    public void writeWithByteArray(){
        String fileName = "C:\\Users\\Alisa\\Desktop\\ZLY\\hello.txt";
        OutputStream out = null;
        File f = new File(fileName);
        try {
            out = new FileOutputStream(f,true);
            String str = "I have a dream ";
            byte[]  b = str.getBytes();
            for (byte b1 : b){
                out.write((int)b1);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null){
                    out.close();
                    out = null;
                }
            }catch (Exception e){

            }
        }
    }




    public static void main(String[] args){
        OutputStreamDemo demo = new OutputStreamDemo();
        demo.writeWithByte();
    }
}
