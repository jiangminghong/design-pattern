package com.jmh.pattern.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** jdk自带的代理实现
 * @description:
 * @author: JMH
 * @create: 2019-03-25 16:04
 */
public class BuyCarHandler implements InvocationHandler {

    private Object obj;

    public Object getInstance(Object obj) {
        this.obj = obj;
        Class<?> aClass = obj.getClass();
        /**
         * loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
         * interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，
         * 如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
         * 这个接口的数量小于65535，这个数量是有class的文件结构规定的
         * h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，
         * 会关联到哪一个InvocationHandler对象上
         */
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(),this);
    }

    /**　　
     * @param proxy 指代我们所代理的那个真实对象
     * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args 指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
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
