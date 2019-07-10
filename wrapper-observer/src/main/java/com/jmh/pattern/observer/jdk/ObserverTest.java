package com.jmh.pattern.observer.jdk;

public class ObserverTest {


    public static void main(String[] args) {
        StudentA observable = new StudentA("fan");
        Teacher t=new Teacher("tom");
        Teacher r=new Teacher("mic");
        observable.addObserver(t);
        observable.addObserver(r);
        observable.question("hashmap yuanma jie xi");
    }
}
