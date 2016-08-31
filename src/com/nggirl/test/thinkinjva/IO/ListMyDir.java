package com.nggirl.test.thinkinjva.IO;

import java.io.File;

/**
 * 这个程序只列出了一层目录，我们想连子目录一起List出来怎么办？
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  15:14
 */
public class ListMyDir {
    public static void main(String[] args){
        String path = "C:\\Users\\Alisa\\git\\testJava";
        File file = new File(path);
        /*File[] fs = file.listFiles();

        for (File f : fs){
            System.out.println(f.getName());
        }*/
        ListMyDir my = new ListMyDir();
        my.print(file);


    }

    public void print(File file){
        if (file != null){
            if (file.isDirectory()){
                File[] files = file.listFiles();
                if (files!= null){
                    for (int i = 0; i < files.length; i++) {
                        print(files[i]);
                    }
                }
            }else {
                System.out.print(file.getName());
            }
        }
    }
}
