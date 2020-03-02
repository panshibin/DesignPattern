package com.builder.demo.builder.ClazzBuilder;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/02 00:01
 */
public class TestBuilder {

    public static void main(String[] args) {
        ZoonFactoryBuilder zoonFactoryBuilder = new ZoonFactoryBuilder();

        zoonFactoryBuilder
                .zoon("狗")
                .ieat(new EatImpl())
                .iaction(new ActionImpl())
                .builder()
                .execute();

    }
}
