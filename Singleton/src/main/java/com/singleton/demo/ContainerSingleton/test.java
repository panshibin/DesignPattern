package com.singleton.demo.demo.ContainerSingleton;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/02/27 23:58
 */
public class test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        thread1.start();

        Thread thread2 = new Thread(new ExectorThread());
        thread2.start();
    }
}
