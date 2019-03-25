package com.jmh.pattern;

import com.jmh.pattern.prototype.deep.UserHobby;
import com.jmh.pattern.prototype.deep.UserInfo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-21 18:07
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        try {
            FileOutputStream outputStream=new FileOutputStream("UserInfo.obj");
            ObjectOutputStream objout=new ObjectOutputStream(outputStream);
            UserInfo userInfo=new UserInfo();
            userInfo.setCertno("dddd");
            UserHobby hobby=new UserHobby();
            hobby.setName("english");
            userInfo.setHobby(hobby);
            objout.writeObject(userInfo);

            FileInputStream inputStream=new FileInputStream("UserInfo.obj");
            ObjectInputStream objinputStream=new ObjectInputStream(inputStream);
            UserInfo o = (UserInfo)objinputStream.readObject();
            System.out.println(o.getHobby());
            System.out.println(userInfo.getHobby());
            System.out.println(o.getCertno());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
