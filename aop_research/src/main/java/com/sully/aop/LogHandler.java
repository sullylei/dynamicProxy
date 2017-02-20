package com.sully.aop;

/**
 * Created by lei.s on 2017/2/17.
 */
public class LogHandler {
    public void LogBefore()
    {
        System.out.println("Log before method");
    }

    public void LogAfter()
    {
        System.out.println("Log after method");
    }
}
