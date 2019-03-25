package com.jmh.pattern.staticproxy;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-25 15:43
 */
public class Zhongjie implements House{

    private House house;

    public Zhongjie(House house) {
        this.house = house;
    }
    @Override
    public void findHoutse(){
        house.findHoutse();
    }

}
