package com.jmh.pattern.dynamicproxy.jdk;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-25 16:09
 */
public class Xiaohong implements BuyCar ,BuyHouse{
    @Override
    public void buycar() {
        System.out.println("xiao hong want to buy bmw");
    }

    @Override
    public void buyHouse() {
        System.out.println("xiao hong want to buy house");
    }
}
