package com.xiaofeiyang.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-06-27 20:51
 */
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML }) // 返回类型
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML }) // 请求类型
@WebService
public interface DemoService {
    @WebMethod(action = "insertProduct")
    public String insertProduct( @WebParam(name = "xmlStr") String voString);
}
