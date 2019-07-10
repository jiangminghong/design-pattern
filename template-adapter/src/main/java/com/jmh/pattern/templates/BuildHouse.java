package com.jmh.pattern.templates;

/**
 * @description: 模板模式 可以通过继承和实现接口的方式
 * @author: JMH
 * @create: 2019-03-27 10:23
 */
public abstract class BuildHouse {

    public final void buildHouse(){
        apply();
        design();
        diji();
        build();
        zhuangxiu();
        sale();
        ruzhu();

    }
    protected final void apply() {
        System.out.println("提交审核单位审核");
    }
    protected final void diji() {
        System.out.println("打地基");
    }

    protected final void build() {
        System.out.println("修房子");
    }

    protected abstract void zhuangxiu();

    protected abstract void sale();

    protected abstract void ruzhu();

    protected abstract void design() ;




}
