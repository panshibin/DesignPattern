package com.prototype.demo.prototype;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;



/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/02 01:10
 */
@Data
public class Zoon implements Cloneable,Serializable {
    private String name;
    private Integer age;
    private List<String > zoons;

    @Override
    public Zoon clone(){
        try {
            return (Zoon) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Zoon deepClone(){
        try {
           Zoon zoon =  (Zoon)super.clone();
            String toJSONString = JSONObject.toJSONString(zoon);
            Zoon parseObject = JSONObject.parseObject(toJSONString, Zoon.class);
            return parseObject;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
