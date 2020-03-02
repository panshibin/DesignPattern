package com.singleton.demo.demo.ThreadLocalSingleton;

/**
 * 类描述:线程单例实现 ThreadLocal
 *
 * @author zhaobinyang
 * @date 2020/02/28 00:14
 */

/**
 * ThreadLocal 不能保证其创建的对象 是全局唯一的，但是能保证在单个线程中是唯一的，天生是线程安全的
 */
public class ThreadLocalSingletonTest {
    private static final ThreadLocal<ThreadLocalSingletonTest> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingletonTest>() {
                @Override
                protected ThreadLocalSingletonTest initialValue() {
                    return new ThreadLocalSingletonTest();
                }
            };

    private ThreadLocalSingletonTest() {
    }

    public static ThreadLocalSingletonTest getInstance() {
        return threadLocalInstance.get();
    }


}
