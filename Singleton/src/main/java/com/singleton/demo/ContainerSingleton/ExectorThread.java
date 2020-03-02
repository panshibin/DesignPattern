package com.singleton.demo.demo.ContainerSingleton;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:35
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        Object object = ContainerSingletonTest.getObject("com.singleton.demo.ContainerSingleton.pojo");
        System.out.println(Thread.currentThread().getName() + ":" + object);
    }
}
