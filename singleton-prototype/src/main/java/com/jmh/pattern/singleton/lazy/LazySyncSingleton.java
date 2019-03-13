package com.jmh.pattern.singleton.lazy;


/**
 * 在方法上加锁解决线程安全问题
 * 缺点：每次调用该方法都会加锁，容易造成类锁，而且有效率问题
 * @author JMH
 */
public class LazySyncSingleton {

    private static LazySyncSingleton lazy;

    private LazySyncSingleton(){}

    public synchronized static LazySyncSingleton getInstance(){
        if(lazy==null){
            lazy=new LazySyncSingleton();
        }
        return lazy;
    }
}

