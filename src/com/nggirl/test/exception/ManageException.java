package com.nggirl.test.exception;

/**
 * 自定义异常
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/3/10  15:49
 */
public class ManageException extends RuntimeException {

    public ManageException(){
        super();
    }
    public ManageException(String s){
        super(s);
    }
    public ManageException(String s,Throwable cause){
        super(s,cause);
    }
    public ManageException(Throwable cause){
        super(cause);
    }
    public ManageException(String message,Throwable cause,boolean a,boolean b){
        super(message,cause,a,b);
    }

}
