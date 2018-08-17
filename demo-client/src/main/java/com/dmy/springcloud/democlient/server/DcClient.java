package com.dmy.springcloud.democlient.server;

import com.dmy.springcloud.democlient.server.impl.DcClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: daimengying
 * @Date: 2018/8/13 18:49
 * @Description:API的消费者。通过Feign服务消费请求Api种的接口
 * 此类绑定的是server-api服务中的接口
 */
@FeignClient(value = "server-api", fallback = DcClientImpl.class)
public interface DcClient {

    @GetMapping("/dc")
    String getDc();
}
