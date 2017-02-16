package com.sully.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by lei.s on 2017/2/16.
 */
public class AfterLogAdvice implements AfterReturningAdvice {
    /**
     * Object returnValue:目标对象返回值
     *  Method method:目标对象方法名
     *  Object[] args:目标对象参数列表
     *  Object target:目标对象
     */
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        afterLog();
    }
    private void afterLog(){
        System.out.println("执行完毕");
    }
}