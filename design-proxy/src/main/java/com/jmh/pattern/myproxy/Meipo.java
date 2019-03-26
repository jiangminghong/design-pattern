package com.jmh.pattern.myproxy;

import java.lang.reflect.Method;

public class Meipo implements MyInvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }

    private Object obj;

    public Object getInstance(Object obj) {
        this.obj = obj;
        Class<?> aClass = obj.getClass();

        return MyProxy.newProxyInstance(new MyClassLoader(), aClass.getInterfaces(),this);
    }
}
