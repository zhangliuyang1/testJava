package com.nggirl.test.thinkinjva.IO;

import java.io.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  15:32
 */
public class InputStreamDemo {
    public void readFile(String fileName){
        File srcFile = new File(fileName);
        InputStream in = null;
        try {
            in = new FileInputStream(srcFile);
            byte[] b = new byte[(int)srcFile.length()];
            for (int i = 0; i < b.length; i++) {
                b[i] = (byte)in.read();
            }

            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null){
                    in.close();
                    in = null;
                }
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args){
        String fileName = "C:\\Users\\Alisa\\git\\testJava\\src\\com\\nggirl\\test\\testList\\TestList.java";
        InputStreamDemo demo = new InputStreamDemo();
        demo.readFile(fileName);
    }
}
