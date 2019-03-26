package com.jmh.pattern;

import static org.junit.Assert.assertTrue;

import com.jmh.pattern.dynamicproxy.jdk.Xiaohong;
import com.jmh.pattern.staticproxy.House;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    public static void main(String[] args) {
        Class<?>[] interfaces = Xiaohong.class.getInterfaces();
        for (Class in : interfaces) {
            System.out.println(in);
        }
//        System.out.println(interfaces);
//        Class [] classes=new Class[]{House.class,House.class};
//        System.out.println(classes.length);
    }
}
