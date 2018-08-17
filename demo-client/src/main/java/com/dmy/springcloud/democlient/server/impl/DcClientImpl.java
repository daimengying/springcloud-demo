package com.dmy.springcloud.democlient.server.impl;

import com.dmy.springcloud.democlient.server.DcClient;
import org.springframework.stereotype.Component;

/**
 * @Author: daimengying
 * @Date: 2018/8/16 18:23
 * @Description: 用于Hystrix服务降级
 */
@Component
public class DcClientImpl implements DcClient {
    @Override
    public String getDc() {
        return "connect to server-api timeout!";
    }
}
