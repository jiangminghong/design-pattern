package com.jmh.pattern.abstractFactory;

public class HuaweiFactory extends AbstractProFactory {
    @Override
    IComputer buildCom() {
        return new HuaWeiComputer();
    }

    @Override
    IPhone buildPhone() {
        return new HuaWeiPhone();
    }
}
