package com.xiaofeiyang.config;

import com.xiaofeiyang.service.DemoServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-02-11 11:32
 */
@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean<CXFServlet> myServlet(){
        ServletRegistrationBean<CXFServlet> registrationBean =new ServletRegistrationBean<CXFServlet>(new CXFServlet(),"/cxf/*");
        return registrationBean;
    }

//    @Bean(name = Bus.DEFAULT_BUS_ID)
//    public SpringBus springBus() {
//        return new SpringBus();
//    }

    /**
     * @return
     */
    @Autowired(required = false)
    private Bus bus;
 /*   @Bean
    @Qualifier("studentServiceImpl") // 注入webService
    public Endpoint endpoint(StudentServiceImpl studentServiceImpl) {
        EndpointImpl endpoint = new EndpointImpl(bus, studentServiceImpl);
        endpoint.publish("/ejb");// 暴露webService api
        return endpoint;
    }*/

    @Bean
    @Qualifier("demoServiceImpl") // 注入webService
    public Endpoint endpoint(DemoServiceImpl demoServiceImpl) {
        EndpointImpl endpoint = new EndpointImpl(bus, demoServiceImpl);
        endpoint.publish("/demo");// 暴露webService api
        return endpoint;
    }

//    @Bean
//    @Qualifier("deliveryNcServiceImpl") // 注入webService
//    public Endpoint endpoint(DeliveryNcServiceImpl deliveryNcServiceImpl) {
//        EndpointImpl endpoint = new EndpointImpl(bus, deliveryNcServiceImpl);
//        endpoint.publish("/delivery");// 暴露webService api
//        return endpoint;
//    }


    @Bean("jsonProvider") // 构造一个json转化bean，用于将student转化为json，因为后面需要用这个bean配置json转化，所以给他取个名
    public JacksonJsonProvider getJacksonJsonProvider() {
        return new JacksonJsonProvider();
    }
}
