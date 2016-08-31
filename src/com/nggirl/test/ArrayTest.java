package com.nggirl.test;

import java.util.UUID;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2015/11/6  13:30
 */
public class ArrayTest {
    public static void main(String[] args) {


      /*  String books[] = new String[]{"java", "C++", "php"};
        String names[] = {"tom", "jhon", "cat"};
        String[] strArr = new String[5];
        System.out.println(books.length + " " + names.length + " " + strArr.length);
        books = names;
        strArr = names;
        books[1]="C语言";
        System.out.println(books.length + " " + names.length + " " + strArr.length+" "+names[1]);
*/
        String str = UUID.randomUUID().toString();
        System.out.println(str);
        StringBuffer sb = new StringBuffer();
        char c = '-';
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch != c){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());


    }
}
