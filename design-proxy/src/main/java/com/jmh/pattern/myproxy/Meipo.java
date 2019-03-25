package com.jmh.pattern.myproxy;

import java.lang.reflect.Method;

public class Meipo implements MyInvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
