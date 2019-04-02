package com.jmh.pattern;

import com.jmh.pattern.templates.BiGuiYuan;
import com.jmh.pattern.templates.BuildHouse;
import com.jmh.pattern.templates.WaiKe;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-27 10:53
 */
public class TemplateTest {
    public static void main(String[] args) {
        BuildHouse buildHouse=new WaiKe();
        buildHouse.buildHouse();
        buildHouse=new BiGuiYuan();
        buildHouse.buildHouse();
    }
}
