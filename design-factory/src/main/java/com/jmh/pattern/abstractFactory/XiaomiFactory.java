package com.jmh.pattern.abstractFactory;

public class XiaomiFactory extends AbstractProFactory {
    @Override
    IComputer buildCom() {
        return new XiaomiComputer();
    }

    @Override
    IPhone buildPhone() {
        return new XiaomiPhone();
    }
}
