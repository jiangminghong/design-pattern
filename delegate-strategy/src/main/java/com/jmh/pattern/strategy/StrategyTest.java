package com.jmh.pattern.strategy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-26 14:50
 */
public class StrategyTest {

    public static void main(String[] args) {

        SaleStrategy comStra=new CommonStrategy();
        StrategyContext context1=new StrategyContext(comStra);
        context1.saleAct();

        SaleStrategy vipStra=new VipStrategy();
        StrategyContext context2=new StrategyContext(vipStra);
        context2.saleAct();
    }
}
