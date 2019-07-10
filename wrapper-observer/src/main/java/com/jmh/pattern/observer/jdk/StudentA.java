package com.jmh.pattern.observer.jdk;

import java.util.Observable;

public class StudentA extends Observable {

    private String name;

    public String getName() {
        return name;
    }

    public StudentA(String name) {
        this.name = name;
    }

    public void question(String question){
        this.setChanged();
        notifyObservers(question);
    }
}
