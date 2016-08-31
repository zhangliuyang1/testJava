package com.nggirl.test.thinkinjva.IO;

import java.io.*;
import java.util.Date;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  15:55
 */
public class CopyFile {

    public void copy(String src,String des){
        File srcFile = new File(src);
        File desFile = new File(des);
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(desFile);
            byte[] b = new byte[(int) srcFile.length()];
            for (int i = 0; i < b.length; i++) {
                b[i] = (byte)in.read();
            }
            out.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                    out = null;
                }
            } catch (Exception e) {
            }
            try {
                if (in != null) {
                    in.close();
                    in = null;
                }
            } catch (Exception e) {
            }
        }
    }


    public static void main(String[] args){
        String src = "C:\\Users\\Alisa\\Desktop\\ZLY\\reser.json.txt";
        String des = "C:\\Users\\Alisa\\Desktop\\ZLY\\hello1.txt";

        CopyFile cp = new CopyFile();
        long starttime = System.currentTimeMillis();
        cp.copy(src,des);
        long endtime = System.currentTimeMillis();
        System.out.println(endtime - starttime);
    }
}
