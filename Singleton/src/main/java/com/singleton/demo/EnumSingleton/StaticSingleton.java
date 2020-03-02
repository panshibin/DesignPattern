package com.singleton.demo.demo.EnumSingleton;

/**
 * 类描述: 饿汉式单利模式
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:21
 */

public class StaticSingleton {
    private StaticSingleton() {
    }

    private static final StaticSingleton INSTANCE = new StaticSingleton();

    public static StaticSingleton getStarvingSingleton() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
