package com.dmy.springcloud.democlient.controller;

import com.dmy.springcloud.democlient.server.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: daimengying
 * @Date: 2018/8/13 18:55
 * @Description:第一个测试类。获取Dc接口的数据
 */
@RestController
public class TestController {
    @Autowired
    DcClient dcClient;

    @PostMapping("/getDc")
    public String dc(@RequestParam(value = "num", defaultValue = "1") Integer num) {
        return dcClient.getDc(num);
    }

}
