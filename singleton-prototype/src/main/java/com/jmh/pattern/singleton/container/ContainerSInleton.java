package com.jmh.pattern.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSInleton {

    private  static final Map<String,Object> map=new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        if(!map.containsKey(className)){
            Object o=null;
            try {
                Class<?> aClass = Class.forName(className);
                o = aClass.newInstance();
            }catch (Exception e){
                e.printStackTrace();
            }
            map.put(className,o);
        }
        return map.get(className);
    }


}
