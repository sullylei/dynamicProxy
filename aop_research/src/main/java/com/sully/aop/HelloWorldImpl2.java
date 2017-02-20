package com.sully.aop;

/**
 * Created by lei.s on 2017/2/17.
 */
public class HelloWorldImpl2 implements HelloWorld {
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
        return ;
    }
}
