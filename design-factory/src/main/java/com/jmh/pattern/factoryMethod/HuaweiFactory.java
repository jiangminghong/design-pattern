package com.jmh.pattern.factoryMethod;

public class HuaweiFactory implements FactoryMethod {
    @Override
    public IPhone producePhone() {
        return new HuaWeiPhone();
    }
}
