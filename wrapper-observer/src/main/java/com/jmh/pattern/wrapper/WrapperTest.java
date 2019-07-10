package com.jmh.pattern.wrapper;

public class WrapperTest {


    public static void main(String[] args) {
        Car bmwCar = new BMWCar();
        bmwCar =new Video_360Wrapper(bmwCar);
        bmwCar=new ZhenpiWrapper(bmwCar);
        bmwCar.carDesign();
    }
}
