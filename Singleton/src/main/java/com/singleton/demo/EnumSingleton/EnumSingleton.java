package com.singleton.demo.demo.EnumSingleton;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/27 23:18
 */
public enum EnumSingleton {
    INSTANCE;

    private Object date;

    public Object getDate() {
        return date;
    }

    public EnumSingleton setDate(Object date) {
        this.date = date;
        return this;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
