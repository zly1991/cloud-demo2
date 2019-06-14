package com.example.imseurekaclient2.sold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sold")
@RestController
public class SoldController {
    @Autowired
   private SoldService soldService;
    @RequestMapping("/sayhi")
    public String sayHiFromSold(){
     return this.soldService.queryClientHi();
    }
}
