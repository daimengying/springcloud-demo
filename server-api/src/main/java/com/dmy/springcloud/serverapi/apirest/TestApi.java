package com.dmy.springcloud.serverapi.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @PostMapping("/dc")
    public String dc(@RequestParam(value = "num", defaultValue = "1") Integer num) {
//        try {
//            Thread.sleep(5000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services+":"+infoName+"-----"+str+"-----param->"+num;
    }


}
