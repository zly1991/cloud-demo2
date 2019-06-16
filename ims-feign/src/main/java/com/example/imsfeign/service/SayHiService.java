package com.example.imsfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//通过feign的方式来访问
//feign是自带断路器的
@FeignClient(value = "service-hi",fallback = HytrixError.class)
@Service
public interface SayHiService {
    @RequestMapping(value = "/order/sayhi",method = RequestMethod.GET)
    public String sayHi();

}
