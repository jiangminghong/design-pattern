package com.jmh.pattern;

import com.jmh.pattern.staticproxy.XiaoMing;
import com.jmh.pattern.staticproxy.Zhongjie;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-25 15:47
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Zhongjie zhongjie=new Zhongjie(new XiaoMing());
        zhongjie.findHoutse();
    }
}
