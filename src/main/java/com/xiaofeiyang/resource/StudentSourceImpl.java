package com.xiaofeiyang.resource;



import com.xiaofeiyang.bean.Student;
import com.xiaofeiyang.bean.Students;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-03-03 16:38
 */
//json调用
@Path("/")
public class StudentSourceImpl implements StudentResource {

    @Override
    @Path("/getjson/{id:[0-9]{0,10}}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Student getStudent(@PathParam("id") Integer id) {
        Student student = new Student();
        student.setAge(10);
        student.setId(1);
        student.setName("杨春");
        student.setSex((char)0);
        student.setAddress("");
        return student;
    }

    /**
     * 没有测试正确性，不是本文重点
     */
    @Override
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/getmany/{ids}")
    public Students getAllStudent(String ids) {
        Students students = new Students();
        Student student = new Student();
        student.setAge(10);
        student.setId(1);
        student.setName("杨春");
        student.setSex((char)0);
        student.setAddress("");
        students.getList().add(student);
        return students;
    }
}
