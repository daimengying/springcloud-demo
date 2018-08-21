package com.dmy.springcloud.apigateway.config;

import com.dmy.springcloud.apigateway.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: daimengying
 * @Date: 2018/8/21 10:19
 * @Description: bean注入
 */
@Configuration
public class BeanConfig {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
