package com.singleton.demo.demo.LazySimple;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:35
 */
public class ExectorThread2 implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton2 lazySimpleSingleton = LazySimpleSingleton2.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
