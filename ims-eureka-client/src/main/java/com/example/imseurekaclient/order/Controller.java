package com.example.imseurekaclient.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Controller {
    @Value("${server.port}")
    String port;
    @RequestMapping("sayhi")
    public String sayHI(){
        return "sayhi:"+port;
    }
}
