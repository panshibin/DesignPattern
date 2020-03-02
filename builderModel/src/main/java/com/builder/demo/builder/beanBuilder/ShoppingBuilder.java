package com.builder.demo.builder.beanBuilder;

import java.math.BigDecimal;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/01 23:29
 */
public class ShoppingBuilder {
    private Shopping testBean = new Shopping();

    public ShoppingBuilder name(String name) {
        testBean.setName(name);
        return this;
    }

    public ShoppingBuilder phone(String phone) {
        testBean.setPhone(phone);
        return this;
    }

    public ShoppingBuilder money(BigDecimal money) {
        testBean.setMoney(money);
        return this;
    }

    public Shopping builder() {
        return testBean;
    }
}
