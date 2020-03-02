package com.builder.demo.builder.beanBuilder;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 类描述: 实体bean
 *
 * @author zhaobinyang
 * @date 2020/03/01 23:23
 */
@Data
public class Shopping {
    private String name;
    private String phone;
    private BigDecimal money;

}
