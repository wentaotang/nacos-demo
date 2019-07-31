package com.hgcode;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@NacosPropertySource(dataId = "demo",autoRefreshed = true)
@RestController
public class SpringBootNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootNacosApplication.class, args);
    }




}
