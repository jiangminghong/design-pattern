package com.jmh.pattern.singleton.threadlocal;

public class ThreadLocalSIngleton {

    private ThreadLocalSIngleton() {

    }
    //一个线程中维护自己的一个实例
    private static final ThreadLocal<ThreadLocalSIngleton> localSIngleton = new ThreadLocal() {

        @Override
        protected ThreadLocalSIngleton initialValue() {
            return new ThreadLocalSIngleton();
        }
    };

}
