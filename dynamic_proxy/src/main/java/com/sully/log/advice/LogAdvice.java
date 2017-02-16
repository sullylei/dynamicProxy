package com.sully.log.advice;

/**
 * Created by lei.s on 2017/2/16.
 */
public class LogAdvice {
    public void beforeLog(){
        System.out.println("开始执行");
    }
    public void afterLog(){
        System.out.println("执行完毕");
    }
}
