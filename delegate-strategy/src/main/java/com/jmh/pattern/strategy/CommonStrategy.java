package com.jmh.pattern.strategy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 14:33
 */
public class CommonStrategy implements SaleStrategy {
    @Override
    public void saleStrategy() {
        System.out.println("大众的活动营销策略");
    }
}
