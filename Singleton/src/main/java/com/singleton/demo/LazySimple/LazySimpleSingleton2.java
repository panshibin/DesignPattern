package com.singleton.demo.demo.LazySimple;

/**
 * 类描述: 静态内部类懒汉式单利模式
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:39
 */

/**
 * 这种形式兼顾饿汉式单例模式的内存浪费问题和 synchronized 的性能问题
 * 完美地屏蔽了这两个缺点
 */
public class LazySimpleSingleton2 {
    //使用 LazyInnerClassGeneral 的时候，默认会先初始化内部类
    // 如果没使用，则内部类是不加载的
    private LazySimpleSingleton2() {
//        throw new RuntimeException("不允许创建多个实例对象");
    }

    //每一个关键字都不是多余的，static是为了使单利的空间共享，保证这个方法不会被重写、重载
    public static final LazySimpleSingleton2 getInstance() {
        //在返回结果以前，一定会先加载内部类
        return LazHolder.LAZY;
    }

    //默认不加载,懒加载
    private static class LazHolder {
        private static final LazySimpleSingleton2 LAZY = new LazySimpleSingleton2();
    }


}
