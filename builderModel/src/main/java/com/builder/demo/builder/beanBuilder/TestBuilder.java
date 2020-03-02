package com.builder.demo.builder.beanBuilder;

import java.math.BigDecimal;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/01 23:35
 */
public class TestBuilder {
    public static void main(String[] args) {
        ShoppingBuilder shoppingBuilder = new ShoppingBuilder();
        shoppingBuilder.name("张三")
                .phone("1820105XXXX")
                .money(BigDecimal.ONE);

        System.out.println(shoppingBuilder.builder());
    }
}
