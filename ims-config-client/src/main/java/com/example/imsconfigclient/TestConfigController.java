package com.example.imsconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@RequestMapping("config")
public class TestConfigController {
    @Value("${foo}")
    private String foo;

    @RequestMapping("sayhi")
    public String sayhi() {
        return this.foo + "hello";
    }
}
