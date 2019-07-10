package com.jmh.pattern.wrapper;

public abstract class CarWrapper implements Car {
    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    public void carDesign(){
       this.car.carDesign();
    }

}
