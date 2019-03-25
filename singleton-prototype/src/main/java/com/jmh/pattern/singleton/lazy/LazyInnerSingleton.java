package com.jmh.pattern.singleton.lazy;

/**
 * 静态内部类实现单例
 * 静态内部类在调用时才会被加载（显示调用getInstance时加载，初始化对象），
 * 实现延迟加载，并且时线程安全的
 * @author JMH
 */
public class LazyInnerSingleton {

    private LazyInnerSingleton(){}

    public static LazyInnerSingleton getInstance(){
        return LazyInner.LAZYINNER;
    }

    //静态内部类的加载不需要依附外部类，在使用时才加载。不过在加载静态内部类的过程中也会加载外部类。
    private static class LazyInner{
        private static final LazyInnerSingleton LAZYINNER=new LazyInnerSingleton();
    }
}
