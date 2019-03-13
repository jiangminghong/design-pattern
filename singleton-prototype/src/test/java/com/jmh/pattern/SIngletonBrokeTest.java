package com.jmh.pattern;

import com.jmh.pattern.singleton.lazy.LazyDoubleSyscSingleton;
import com.jmh.pattern.singleton.lazy.LazySimpleSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SIngletonBrokeTest {

//通过反射拿到对象，破坏单例
    //    public static void main(String[] args) {
//
//        try {
//            Constructor constructor = LazySimpleSingleton.class.getDeclaredConstructor(null);
//            //设置可以取得私有构造方法
//            constructor.setAccessible(true);
//            Object o = constructor.newInstance();
//            System.out.println(LazyDoubleSyscSingleton.getInstance());
//            System.out.println(o);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    //对象实现序列化，通过读写对象破坏单例
    //重写
    public static void main(String[] args) {
        try {
            LazyDoubleSyscSingleton instance = LazyDoubleSyscSingleton.getInstance();
            FileOutputStream fileOutputStream=new FileOutputStream("Singleton.obj");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(instance);
            fileOutputStream.close();
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("Singleton.obj");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println(instance);
            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
