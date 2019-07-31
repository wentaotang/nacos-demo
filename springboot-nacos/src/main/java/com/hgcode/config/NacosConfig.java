package com.hgcode.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NacosConfig {

    @NacosValue(value = "${abc}",autoRefreshed = true)
    private String value;

    public String getValue() {
        return value;
    }
}
