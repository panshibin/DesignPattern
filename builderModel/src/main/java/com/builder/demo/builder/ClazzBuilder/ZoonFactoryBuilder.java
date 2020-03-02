package com.builder.demo.builder.ClazzBuilder;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/01 23:55
 */
public class ZoonFactoryBuilder {
    private ZoonFactory zf = new ZoonFactory();

    public ZoonFactoryBuilder zoon(String zoon) {
        zf.setZoon(zoon);
        return this;
    }

    public ZoonFactoryBuilder ieat(Ieat clazz) {
        zf.setIeat(clazz);
        return this;
    }

    public ZoonFactoryBuilder iaction(Iaction clazz) {
        zf.setIaction(clazz);
        return this;
    }

    public ZoonFactory builder() {
        return zf;
    }
}
