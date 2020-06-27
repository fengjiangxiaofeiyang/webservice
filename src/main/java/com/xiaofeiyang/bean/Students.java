package com.xiaofeiyang.bean;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-03-03 16:35
 */
@Data
@XmlRootElement
public class Students {
    private List<Student> list =new ArrayList<>();
}
