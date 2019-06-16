package com.example.imsfeign.service;

import org.springframework.stereotype.Component;

/**
 * 断路器回调方法
 */
@Component
public class HytrixError implements  SayHiService {

    @Override
    public String sayHi() {
        return    "error";
    }
}
