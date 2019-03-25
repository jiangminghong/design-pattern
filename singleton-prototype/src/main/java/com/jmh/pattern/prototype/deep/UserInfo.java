package com.jmh.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-14 16:43
 */
public class UserInfo implements Serializable {

    private String name;

    private String certno;

    private UserHobby hobby;

    public UserHobby getHobby() {
        return hobby;
    }

    public void setHobby(UserHobby hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    private void add(){

    }
    /**
     * 浅克隆  使用jdk自带的克隆，实现cloneable接口，
     * 特点：
     * @return
     */
    @Override
    public UserInfo clone() {
//        UserInfo userInfo =new UserInfo();
//        userInfo.setCertno(this.certno);
//        userInfo.setName(this.name);
        UserInfo obj=null;
        try {
             obj =(UserInfo) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }


}
