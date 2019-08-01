package com.hgcode.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class NacosConfig {

    @Value(value = "${abc.def}")
    private String value;

    public String getValue() {
        return value;
    }
}
