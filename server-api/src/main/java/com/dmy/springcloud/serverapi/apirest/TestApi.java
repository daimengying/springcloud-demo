package com.dmy.springcloud.serverapi.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: daimengying
 * @Date: 2018/8/13 17:47
 * @Description:API对外暴露服务测试类
 */
@RestController
@RefreshScope
public class TestApi {
    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${info.name}")
    private String infoName;
    @Value("${str}")
    private String str;

    @GetMapping("/dc")
    public String dc() {
//        String services = "Services: " + discoveryClient.getServices();
//        System.out.println(services);
        return infoName+"-----"+str;
    }
}
