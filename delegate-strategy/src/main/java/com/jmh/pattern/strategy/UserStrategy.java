package com.jmh.pattern.strategy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 14:33
 */
public class UserStrategy implements SaleStrategy{
    @Override
    public void saleStrategy() {
        System.out.println("用户的活动营销策略");
    }
}
