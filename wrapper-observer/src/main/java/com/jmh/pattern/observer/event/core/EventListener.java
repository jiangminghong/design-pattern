package com.jmh.pattern.observer.event.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件监听思路：监听的对象，触发后的回调（通知观察者）
 * @author jmh
 */
public class EventListener {

    public static final Map<String,Event> map=new HashMap();


    /**
     * 添加要监听或观察的事件
     * @param eventType 事件类型
     * @param target 回调或通知目标，
     */
    public void addListener(String eventType,Object target){

        try {
            this.addListener(eventType,target,
                    target.getClass().getMethod("on"+toUpperCase(eventType),Event.class));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private void addListener(String eventType, Object target, Method callback){
        if(!map.containsKey(eventType)){
            map.put(eventType,new Event(target,callback));
        }
    }

    protected void trigger(String eventType){
        if(map.containsKey(eventType)){
            Event event = map.get(eventType);
            event.setTrigger(eventType);
            trigger(event);
        }
    }

    /**
     * 回调或通知的目标
     * @param event
     */
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getCallback().invoke(event.getTarget(),event);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private String toUpperCase(String s){
        char[] chars = s.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
