package com.sully.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lei.s on 2017/2/17.
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        HelloWorld impl1 = (HelloWorld) applicationContext.getBean("helloWorldImpl1");
        HelloWorld impl2 = (HelloWorld) applicationContext.getBean("helloWorldImpl2");

        impl1.doPrint();
        System.out.println("---------------------");
        impl2.doPrint();
    }
}
