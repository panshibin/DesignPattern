package com.singleton.demo.demo.LazySimple;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/28 00:29
 */
public class test2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread2());
        Thread thread2 = new Thread(new ExectorThread2());
        thread1.start();
        thread2.start();
    }
}
