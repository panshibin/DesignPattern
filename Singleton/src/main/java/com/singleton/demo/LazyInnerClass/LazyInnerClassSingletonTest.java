package com.singleton.demo.demo.LazyInnerClass;

import com.singleton.demo.LazySimple.LazySimpleSingleton;
import com.singleton.demo.LazySimple.LazySimpleSingleton2;

import java.lang.reflect.Constructor;

/**
 * 类描述:反射破坏单利
 *
 * @author zhaobinyang
 * @date 2020/02/27 22:58
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            //对单利进行破坏
            Class<?> clazz = LazySimpleSingleton2.class;

            //通过反射获取私有的构造方法
            Constructor declaredConstructors = clazz.getDeclaredConstructor(null);

            //强制访问
            declaredConstructors.setAccessible(true);

            //暴力破解
            Object o1 = declaredConstructors.newInstance();
            //调用了两次，相当于new了两次，犯了原则性
            Object o2 = declaredConstructors.newInstance();

            System.out.println(o1);
            System.out.println(o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
