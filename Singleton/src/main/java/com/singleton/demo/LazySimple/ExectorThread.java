package com.singleton.demo.demo.LazySimple;

import com.singleton.demo.Hungry.HungryStaticSingleton;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:35
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
