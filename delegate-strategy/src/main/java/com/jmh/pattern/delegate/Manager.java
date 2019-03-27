package com.jmh.pattern.delegate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 13:47
 */
public class Manager implements Task {

    private static final Map<String, Task> map=new ConcurrentHashMap<>();

    static {
        map.put("login",new EmployeeA());
        map.put("reg",new EmployeeB());
    }
    @Override
    public void excuteTask(String commond) {
        System.out.println();
        map.get(commond).excuteTask(commond);
    }
}
