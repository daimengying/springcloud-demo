package com.dmy.springcloud.democlient.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: daimengying
 * @Date: 2018/8/13 18:49
 * @Description:API的消费者。通过Feign服务消费请求Api种的接口
 * 此类绑定的是server-api服务中的接口
 */
@FeignClient("server-api")
public interface DcClient {

    @GetMapping("/dc")
    String getDc();
}
