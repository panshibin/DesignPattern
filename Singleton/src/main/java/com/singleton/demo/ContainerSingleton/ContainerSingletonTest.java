package com.singleton.demo.ContainerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类描述: 容器式单利
 *
 * @author zhaobinyang
 * @date 2020/02/27 23:32
 */
public class ContainerSingletonTest {

    private ContainerSingletonTest(){}

    private static Map<String ,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getObject(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try{
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);

                }catch (Exception e){
                    e.printStackTrace();
                }
                return ioc;
            }else {
                return ioc.get(className);
            }
        }
    }
}
