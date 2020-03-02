package com.singleton.demo.demo.LazySimple;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/28 00:30
 */
public class test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
    }
}
