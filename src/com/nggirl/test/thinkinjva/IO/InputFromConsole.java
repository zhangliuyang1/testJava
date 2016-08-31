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
        System.in.read(input);

        System.out.println("your input is:" + new String(input));
    }
}
