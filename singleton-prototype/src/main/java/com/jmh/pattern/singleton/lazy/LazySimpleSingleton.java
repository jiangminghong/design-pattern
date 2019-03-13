package com.jmh.pattern.singleton.lazy;

/**
 * 简单的懒汉单例模式--需要时才去加载创建对象
 * 缺点：有线程安全问题
 * 可以new 两个线程debug线程不安全的问题，可以在断点上设置以线程级别来调试。
 * @author JMH
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if(lazy==null){
            lazy=new LazySimpleSingleton();
        }
        return lazy;
    }
}
