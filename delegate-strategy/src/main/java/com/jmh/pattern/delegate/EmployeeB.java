package com.jmh.pattern.delegate;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 13:48
 */
public class EmployeeB implements Task {
    @Override
    public void excuteTask(String commond) {
        System.out.println("i am employee b excute "+commond);
    }
}
