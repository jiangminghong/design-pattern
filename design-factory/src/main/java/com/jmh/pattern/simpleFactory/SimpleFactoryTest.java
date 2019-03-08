package com.jmh.pattern.simpleFactory;

public class SimpleFactoryTest {


    public static void main(String[] args) {
        SimpleFactory simpleFactory=new PhoneFactory();
        simpleFactory.producePhone(HuaWeiPhone.class).listenMusic();
    }
}
