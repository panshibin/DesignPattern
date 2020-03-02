package com.singleton.demo.ThreadLocalSingleton;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/28 00:15
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingletonTest threadLocalSingletonTest = ThreadLocalSingletonTest.getInstance();
        System.out.println(ThreadLocalSingletonTest.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + threadLocalSingletonTest);
    }
}
