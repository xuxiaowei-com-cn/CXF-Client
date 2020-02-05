package cn.com.xuxiaowei.client;

import cn.com.xuxiaowei.web.service.WebServicesTestService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

/**
 * CXF WebService 客户端
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public class CxfClientTests {

    /**
     *
     */
    private static final String address = "http://127.0.0.1:8080/ws/testWebService?wsdl";

    /**
     *
     */
    private static final String username = "徐晓伟";

    @Test
    public void jaxWsProxyFactoryBean() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress(address);
        jaxWsProxyFactoryBean.setServiceClass(WebServicesTestService.class);
        WebServicesTestService webServicesTestService = (WebServicesTestService) jaxWsProxyFactoryBean.create();
        String result = webServicesTestService.hiWebService(username);
        System.out.println("返回结果：" + result);
    }

}