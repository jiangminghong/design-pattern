package com.jmh.pattern;

import com.jmh.pattern.dynamicproxy.jdk.BuyCar;
import com.jmh.pattern.dynamicproxy.jdk.BuyCarHandler;
import com.jmh.pattern.dynamicproxy.jdk.Xiaohong;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-25 16:05
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        Object obj=new BuyCarHandler().getInstance(new Xiaohong());
//        System.out.println(obj);
        try {
            Method buycar = obj.getClass().getMethod("buycar", null);
            buycar.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
