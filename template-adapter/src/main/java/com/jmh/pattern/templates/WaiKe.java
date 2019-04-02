package com.jmh.pattern.templates;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-27 10:46
 */
public class WaiKe extends BuildHouse {
    @Override
    protected void zhuangxiu() {
        System.out.println("我要精装修好赚更多的钱");
    }

    @Override
    protected void sale() {
        System.out.println("这地段这么好，我要卖高点");
    }

    @Override
    protected void ruzhu() {
        System.out.println("交房后必须入住");
    }

    @Override
    protected void design() {
        System.out.println("设计成北欧风格");
    }
}
