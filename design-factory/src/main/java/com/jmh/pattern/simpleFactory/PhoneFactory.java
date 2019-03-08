package com.jmh.pattern.simpleFactory;

public class PhoneFactory implements SimpleFactory {

    @Override
    public IPhone producePhone(Class clzz) {
        try {
            return (IPhone) clzz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
