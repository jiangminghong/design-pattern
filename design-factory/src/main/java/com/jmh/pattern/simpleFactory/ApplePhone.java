package com.jmh.pattern.simpleFactory;

public class ApplePhone implements IPhone {
    @Override
    public void listenMusic() {
        System.out.println("apple listen music");
    }
}
