package com.singleton.demo.demo.LazySimple;

/**
 * 类描述: 双重检查锁懒汉式单利模式
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:39
 */

/**
 * 优点：需要时加载，线程安全，双重检查锁单利模式
 * 缺点：使用synchronized类终究会阻塞
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    private volatile static LazySimpleSingleton laz=null;

    public static LazySimpleSingleton getInstance(){
        if(laz == null){
            synchronized(LazySimpleSingleton.class){
                if(laz == null){
                    laz = new LazySimpleSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置 lazy 指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return laz;
    }

}
