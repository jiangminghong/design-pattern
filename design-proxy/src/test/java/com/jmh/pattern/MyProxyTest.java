package com.jmh.pattern;

import com.jmh.pattern.dynamicproxy.jdk.BuyCarHandler;
import com.jmh.pattern.dynamicproxy.jdk.Xiaohong;
import com.jmh.pattern.myproxy.*;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 16:45
 */
public class MyProxyTest {

    public static void main(String[] args) {
//        System.out.println(MyClassLoader.class.getPackage().getName());
//        System.out.println(MyClassLoader.class.getResource("").getPath());
        System.out.println(MyProxy.generateObjStr(Boy.class.getInterfaces()));
        Object obj=new Meipo().getInstance(new Boy());
//        System.out.println(obj.getClass().getName());
//        System.out.println();
        try {
            Method findGirl = obj.getClass().getMethod("findGirl", null);
            findGirl.invoke(obj);
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Xiaohong.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
