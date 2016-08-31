package com.nggirl.test.IOTest;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/12/4  14:47
 */
public class TestRead {
    public static void main(String[] args){
        File file = new File("E:\\a.txt");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader r = new BufferedReader(reader);

            StringBuffer sb = new StringBuffer();
            String str = r.readLine();
            if (str != null){
                sb.append(str);
            }
            System.out.println(sb.toString());

            String[] ss = sb.toString().split(",");
            List<String> list = Arrays.asList(ss);
            for (int i = 0; i < list.size(); i++) {

                for (int j = list.size() - 1; i < j ; j--) {
                    if (list.get(i).equals(list.get(j))){
                        System.out.println(list.get(i));
                    }
                }
            }
        /*     int fileLen = (int)file.length();
            char[] chars = new char[fileLen];
            reader.read(chars);
            String txt = String.valueOf(chars);
            System.out.println(txt);
*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
