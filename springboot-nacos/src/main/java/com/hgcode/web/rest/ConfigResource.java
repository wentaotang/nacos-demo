package com.hgcode.web.rest;

import com.hgcode.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigResource {

    @Autowired
    private NacosConfig nacosConfig;

    @GetMapping("/key")
    public String getkey(){
        return nacosConfig.getValue();
    }
}
