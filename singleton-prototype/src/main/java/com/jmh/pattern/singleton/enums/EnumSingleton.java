package com.jmh.pattern.singleton.enums;

public enum  EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
