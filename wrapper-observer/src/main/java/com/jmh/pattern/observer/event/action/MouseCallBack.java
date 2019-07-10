package com.jmh.pattern.observer.event.action;

import com.jmh.pattern.observer.event.core.Event;

public class MouseCallBack {

    public void onClick(Event event){
        System.out.println("单击事件===========回调");
    }

    public void onDoubleClick(Event event){
        System.out.println("双击击事件===========回调");
    }

    public void onMove(Event event){
        System.out.println("移动事件===========回调");
    }
}
