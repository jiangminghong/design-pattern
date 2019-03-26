package com.jmh.pattern;

import com.jmh.pattern.dynamicproxy.jdk.BuyCarHandler;
import com.jmh.pattern.dynamicproxy.jdk.Xiaohong;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-25 16:05
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        Object obj=new BuyCarHandler().getInstance(new Xiaohong());
        System.out.println(obj.getClass().getName());//com.sun.proxy.$Proxy0
        try {
            Method buycar = obj.getClass().getMethod("buyHouse", null);
            buycar.invoke(obj);
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Xiaohong.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
