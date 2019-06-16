package com.example.imsfeign.Controller;

import com.example.imsfeign.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class SayHiController {

    @Autowired
    private  SayHiService sayHiService;
    @RequestMapping("/hi")
    public String sayhi(){
        return  this.sayHiService.sayHi();
    }
}
