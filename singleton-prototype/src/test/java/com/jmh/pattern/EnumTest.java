package com.jmh.pattern;

import com.jmh.pattern.singleton.enums.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumTest {


    public static void main(String[] args) {

        try {
            EnumSingleton.getInstance();
            Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            EnumSingleton enumSingleton = constructor.newInstance();
            System.out.println(enumSingleton);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
