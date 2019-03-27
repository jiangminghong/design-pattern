package com.jmh.pattern.delegate;

/**
 * @description: 委派模式
 * @author: JMH
 * @create: 2019-03-26 13:59
 */
public class DelegateTest {

    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.excuteTask("login");
    }
}
