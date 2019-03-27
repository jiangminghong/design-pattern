package com.jmh.pattern.myproxy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 17:09
 */
public class Boy implements Person {
    @Override
    public void findGirl() {
        System.out.println("boy find girl");
    }
}
