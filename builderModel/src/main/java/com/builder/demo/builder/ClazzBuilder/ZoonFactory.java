package com.builder.demo.builder.ClazzBuilder;

import lombok.Data;

/**
 * 类描述:
 *
 * @author zhaobinyang
 * @date 2020/03/01 23:51
 */
@Data
public class ZoonFactory {
    public String zoon;

    public Ieat ieat;
    public Iaction iaction;

    public void execute() {
        StringBuffer stringBuffer = new StringBuffer();
        String context = stringBuffer.append(zoon)
                .append("吃")
                .append(ieat.eat(zoon))
                .append("喜欢")
                .append(iaction.action(zoon)).toString();

        System.out.println(context);
    }
}
