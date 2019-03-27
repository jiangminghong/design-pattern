package com.jmh.pattern.strategy;

/**
 * @description: 策略执行类
 * @author: JMH
 * @create: 2019-03-26 14:38
 */
public class StrategyContext {

    private SaleStrategy saleStrategy;

    public StrategyContext(SaleStrategy saleStrategy) {
        this.saleStrategy = saleStrategy;
    }

    public void saleAct(){
        saleStrategy.saleStrategy();
    }

}
