package com.jmh.pattern.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-25 16:04
 */
public class BuyCarHandler implements InvocationHandler {

    private Object obj;

    public Object getInstance(Object obj) {
        this.obj = obj;
        Class<?> aClass = obj.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        be();
        Object invoke = method.invoke(obj,args);
        af();
        return invoke;
    }

    private void be(){
        System.out.println("buy car before");
    }
    private void af(){
        System.out.println("buy car after");
    }
}
