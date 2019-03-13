package com.jmh.pattern.singleton.lazy;

import java.io.Serializable;

/**
 * 双重校验锁单例(DCL--double check lock)
 * @author JMH
 */
public class LazyDoubleSyscSingleton implements Serializable {

    private static LazyDoubleSyscSingleton lazy;

    private LazyDoubleSyscSingleton(){}

    public static LazyDoubleSyscSingleton getInstance(){

        if(lazy==null){
            synchronized (LazyDoubleSyscSingleton.class){
                if (lazy==null){
                    lazy=new LazyDoubleSyscSingleton();
                }
            }
        }

        return lazy;
    }
    //重写resovle方法，虽然返回的是一个对象，但是还是创建了两次，发生在jvm层面
    //只是将反序列化的对象覆盖了，之后这个对象会被gc回收
    private Object readResolve(){
        return lazy;
    }
}
