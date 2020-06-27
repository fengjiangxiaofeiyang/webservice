package com.xiaofeiyang.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-06-27 20:52
 */
@Component//由Spring管理
@WebService(endpointInterface = "com.xiaofeiyang.service.DemoService",targetNamespace = "http://service.xiaofeiyang.com" ) // webservice接口的全类名
@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String insertProduct(String voString) {
        return null;
    }
}
