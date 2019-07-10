package com.jmh.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(Observable o, Object arg) {
        StudentA a=(StudentA)o;
        System.out.println("Student name "+a.getName()+" 提问 "+this.getName()+" recevice question: "+arg);
    }
}
