package com.jmh.pattern.observer.event;

import com.jmh.pattern.observer.event.action.EventType;
import com.jmh.pattern.observer.event.action.Mouse;
import com.jmh.pattern.observer.event.action.MouseCallBack;

public class ListenerTest {


    public static void main(String[] args) {
        MouseCallBack mouseCallBack=new MouseCallBack();
        Mouse mouse=new Mouse();
        mouse.addListener(EventType.MOVE,mouseCallBack);
        mouse.addListener(EventType.CLICK,mouseCallBack);
        mouse.addListener(EventType.DOUBLE_CLICK,mouseCallBack);

        mouse.click();
    }
}
