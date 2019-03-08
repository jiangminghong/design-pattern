package com.jmh.pattern.factoryMethod;

public class AppleFactory implements FactoryMethod {
    @Override
    public IPhone producePhone() {
        return new ApplePhone();
    }
}
