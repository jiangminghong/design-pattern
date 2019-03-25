package com.jmh.pattern;

import com.jmh.pattern.prototype.shallow.UserHobby;
import com.jmh.pattern.prototype.shallow.UserInfo;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-21 15:07
 */
public class ShallowCloneTest {


    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setCertno("ddddd");
        UserHobby userHobby = new UserHobby();
        userHobby.setId(111L);
        userHobby.setName("jjjj");
        userInfo.setHobby(userHobby);
        UserInfo clone = userInfo.clone();
        System.out.println(userInfo.getCertno()==clone.getCertno());
        System.out.println(clone.getHobby());
        System.out.println(userInfo.getHobby());
        userInfo.getHobby().setName("llll");
        System.out.println(clone.getHobby().getName());
        System.out.println(userInfo.getHobby().getName());
    }
}
