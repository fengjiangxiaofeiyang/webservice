package com.xiaofeiyang.utils;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import java.net.URL;

/**
 * @author: yangchun
 * @description:
 * @date: Created in 2020-06-07 12:34
 */
@Component
public class NcUtils {
    @Value("${ncAddress}")
    private String bipEndpoint1;//外网正式
    @Value("${ncNameSpace}")
    private String bipNamespace1;
    private Service service = new Service();
    public String callNc(String strJson,String funname) throws Exception {
        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(new URL(bipEndpoint1));
        call.setOperationName(new QName(bipNamespace1, funname));
        call.addParameter("string", XMLType.XSD_STRING, ParameterMode.IN);
        call.setEncodingStyle("UTF-8");
        call.setReturnType(XMLType.XSD_STRING);
        Object o = call.invoke(new Object[] {strJson});
        String result=o.toString();
        return result;
    }
}
