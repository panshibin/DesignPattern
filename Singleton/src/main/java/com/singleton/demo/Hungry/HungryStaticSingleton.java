package com.singleton.demo.demo.Hungry;

/**
 * 类描述: 饿汉式单利模式
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:21
 */

/**
 * 优点：没有加锁，执行效率高，用户体验比懒汉单利模式更好
 * 缺点：类加载时就初始化，不管用不用都占内存空间
 */
public class HungryStaticSingleton {
    private HungryStaticSingleton() {}
    /**
     * 一、经典写法 start
     */
//    private static final HungryStaticSingleton starvingSingleton = new HungryStaticSingleton();
    /**一、经典写法 end */

    /** 二、静态块饿汉单利模式 start */
    private static final HungryStaticSingleton starvingSingleton;

    static {
        starvingSingleton = new HungryStaticSingleton();
    }
    /** 二、静态块饿汉单利模式 end */

    public static HungryStaticSingleton getStarvingSingleton() {
        return starvingSingleton;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread.start();
        thread2.start();
    }

}
