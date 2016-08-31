package com.nggirl.test.thinkinjva.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  16:13
 */
public class RandomAccess {
    public void writeToFile(){
        String fileName = "C:\\Users\\Alisa\\Desktop\\ZLY\\hello2.txt";
        RandomAccessFile accessFile = null;
        File f = new File(fileName);
        try {
            accessFile = new RandomAccessFile(f,"rw");
            accessFile.writeBytes("aaaaaaaaaaaa");
            accessFile.writeInt(12);
            accessFile.writeBoolean(true);
            accessFile.writeChar('A');
            accessFile.writeFloat(1.2f);
            accessFile.writeDouble(12.23);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (accessFile != null){
                    accessFile.close();
                    accessFile = null;
                }
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args){
        RandomAccess access = new RandomAccess();
        access.writeToFile();
    }
}
