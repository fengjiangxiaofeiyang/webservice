package com.xiaofeiyang.bean;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-03-03 16:35
 */
@Data
@XmlRootElement
public class Student {
    private Integer id;
    private String name;
    private char sex;
    private String address;
    private Integer age;
}
