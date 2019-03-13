package com.jmh.pattern.singleton.lazy;

public class ExcutorThread implements Runnable {

    @Override
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazySyncSingleton instance = LazySyncSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
