package com.jmh.pattern.singleton.hungry;

/**
 * 饿汉模式--静态变量和静态代码块初始化
 * 类加载时就初始化
 * 优点：执行效率快，不存在线程安全问题
 * 缺点：当不使用时，可能造成内存浪费。
 * @author JMH
 */
public class HungrySingleton {

    /**
     * 变量加final修饰，防止随意赋值修改
     */
    private static final HungrySingleton SINGLETON=new HungrySingleton();
    /**
     * 构造器私有化，防止随意new 对象
     */
    private HungrySingleton(){}

//    static {
//        SINGLETON=new HungrySingleton();
//    }

    public HungrySingleton getInstance(){
        return SINGLETON;
    }
}
