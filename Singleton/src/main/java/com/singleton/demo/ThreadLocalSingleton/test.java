package com.singleton.demo.ThreadLocalSingleton;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/28 00:18
 */
public class test {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingletonTest.getInstance());
        System.out.println(ThreadLocalSingletonTest.getInstance());
        System.out.println(ThreadLocalSingletonTest.getInstance());
        System.out.println(ThreadLocalSingletonTest.getInstance());
        System.out.println(ThreadLocalSingletonTest.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
