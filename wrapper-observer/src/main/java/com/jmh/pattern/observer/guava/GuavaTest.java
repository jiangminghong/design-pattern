package com.jmh.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.jmh.pattern.observer.jdk.StudentA;

public class GuavaTest {


    public static void main(String[] args) {
        GuavaTeacher mic=new GuavaTeacher("mic");
        GuavaTeacher tom=new GuavaTeacher("tom");
        Questions questions=new Questions();
        questions.setUsername("fan");
        questions.setQuestionContent("bing fa bian cheng");
        EventBus eventBus=new EventBus();
        eventBus.register(mic);
        eventBus.register(tom);
        eventBus.post(questions);
    }

}
