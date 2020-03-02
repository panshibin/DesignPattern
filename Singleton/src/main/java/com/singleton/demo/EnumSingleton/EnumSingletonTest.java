package com.singleton.demo.demo.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 类描述: 枚举式单例模式
 *
 * @author zhaobinyang
 * @date 2020/02/27 23:19
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        try {

            EnumSingleton enumSingleton1 = null;
            EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
            enumSingleton2.setDate(new Object());

            FileOutputStream fileOutputStream = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(enumSingleton2);
            objectOutputStream.close();
            fileOutputStream.close();


            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            enumSingleton1 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(enumSingleton1.getDate());
            System.out.println(enumSingleton2.getDate());
            System.out.println(enumSingleton1.getDate() == enumSingleton2.getDate());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
