package com.jmh.pattern.observer.event.action;

import com.jmh.pattern.observer.event.core.EventListener;

public class Mouse extends EventListener {

    public void doubleClick(){
        System.out.println("触发双击doubleclick事件=======");
        trigger(EventType.DOUBLE_CLICK);
    }

    public void move(){
        System.out.println("触发移动move事件=======");
        trigger(EventType.MOVE);
    }

    public void click(){
        System.out.println("触发单击click事件=======");
        trigger(EventType.CLICK);
    }
}
