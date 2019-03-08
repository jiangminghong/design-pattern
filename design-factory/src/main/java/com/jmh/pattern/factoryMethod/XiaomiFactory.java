package com.jmh.pattern.factoryMethod;

public class XiaomiFactory implements FactoryMethod {
    @Override
    public IPhone producePhone() {
        return new XiaomiPhone();
    }
}
