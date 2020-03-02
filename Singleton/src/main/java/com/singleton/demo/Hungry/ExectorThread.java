package com.singleton.demo.demo.Hungry;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:35
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        HungryStaticSingleton starvingSingleton = HungryStaticSingleton.getStarvingSingleton();
        System.out.println(Thread.currentThread().getName() + ":" + starvingSingleton);
    }
}
