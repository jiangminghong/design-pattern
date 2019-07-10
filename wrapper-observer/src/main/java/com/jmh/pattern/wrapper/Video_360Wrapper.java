package com.jmh.pattern.wrapper;

public class Video_360Wrapper extends CarWrapper  {

    public Video_360Wrapper(Car car) {
        super(car);
    }

    @Override
    public void carDesign() {
        super.carDesign();
        System.out.println("安装360全息影像");
    }
}
