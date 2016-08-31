package com.nggirl.test.hostname;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/5/3  15:02
 */
public class GetRemote {
    public static void main(String[] args){
        String hostName = "";
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(hostName);
    }
}
