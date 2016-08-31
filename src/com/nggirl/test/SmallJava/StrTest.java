package com.nggirl.test.SmallJava;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/12/10  20:39
 */
public class StrTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] keybytes = "nangua_test".getBytes("UTF-8");
        for (byte b : keybytes){
            System.out.println(b);
        }

    }
}
