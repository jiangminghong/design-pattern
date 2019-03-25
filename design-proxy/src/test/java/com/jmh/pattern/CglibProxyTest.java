package com.jmh.pattern;

import com.jmh.pattern.dynamicproxy.cglib.CglibProxy;
import com.jmh.pattern.dynamicproxy.cglib.Person;

import java.lang.reflect.Method;

public class CglibProxyTest {

    public static void main(String[] args) {
        CglibProxy proxy=new CglibProxy();
        Object instance = proxy.getInstance(new Person());
        try {
            Method buycar = instance.getClass().getMethod("buycar");
            buycar.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
