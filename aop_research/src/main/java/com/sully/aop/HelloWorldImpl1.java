package com.sully.aop;

/**
 * Created by lei.s on 2017/2/17.
 */
public class HelloWorldImpl1 implements HelloWorld {
    @Override
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }
    @Override
    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
        return ;
    }
}
