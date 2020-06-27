package com.xiaofeiyang.resource;


import com.xiaofeiyang.bean.Student;
import com.xiaofeiyang.bean.Students;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-03-03 16:32
 */
public interface StudentResource {
    /**
     * @param id
     * @return
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/getone/{id:[0-9]{0,10}}") // 限制id只能是0~9的数组 不超过10位
    Student getStudent(@PathParam("id") Integer id);

    /**
     * 查找多个学生
     *
     * @param ids
     * @return
     */

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/getmany/{ids}")
    Students getAllStudent(@PathParam("ids") String ids);
}
