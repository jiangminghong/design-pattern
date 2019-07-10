package com.jmh.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaTeacher {


    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }
    @Subscribe
    public void notice(Questions questions){
        System.out.println("Student name "+questions.getUsername()+" 提问 "
                +name+" recevice question: "+questions.getQuestionContent());

    }
}
