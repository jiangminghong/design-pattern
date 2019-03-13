package com.jmh.pattern;

import com.jmh.pattern.singleton.lazy.ExcutorThread;

public class LazySingletonTest {


    public static void main(String[] args) {

        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());
        t1.start();
        t2.start();


    }
}
