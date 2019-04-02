package com.jmh.pattern.templates;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-27 10:46
 */
public class BiGuiYuan extends BuildHouse {
    @Override
    protected void zhuangxiu() {
        System.out.println("我卖清水房，自己去装修把，我不管");
    }

    @Override
    protected void sale() {
        System.out.println("回馈大众，便宜甩卖");
    }

    @Override
    protected void ruzhu() {
        System.out.println("管你什么时候入住");
    }

    @Override
    protected void design() {
        System.out.println("自己装修，自己设计");
    }
}
