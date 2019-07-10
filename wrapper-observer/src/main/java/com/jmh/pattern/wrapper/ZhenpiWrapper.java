package com.jmh.pattern.wrapper;

public class ZhenpiWrapper extends CarWrapper  {

    public ZhenpiWrapper(Car car) {
        super(car);
    }

    @Override
    public void carDesign() {
        super.carDesign();
        System.out.println("装饰真皮座椅");
    }
}
