package com.prototype.demo.prototype;

import java.util.Arrays;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/02 01:22
 */
public class TestClonse {
    public static void main(String[] args) {
        Zoon zoon = new Zoon();
        zoon.setAge(1);
        zoon.setName("小狗");
        zoon.setZoons(Arrays.asList("白色", "黑色"));

        Zoon clone = zoon.clone();
        Zoon deepClone = zoon.deepClone();
        deepClone.getZoons().add("花色");

        System.out.println(clone == deepClone);
        System.out.println(clone.toString());
        System.out.println(deepClone.toString());
    }
}
