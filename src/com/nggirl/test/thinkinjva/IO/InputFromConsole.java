package com.nggirl.test.thinkinjva.IO;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/31  15:08
 */
public class InputFromConsole {
    public static void main(String[] args) throws IOException {
        byte[] input = new byte[1024];
        //System.in.read(input);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("path.separator"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));


        System.out.println("your input is:" + new String(input));
    }
}
