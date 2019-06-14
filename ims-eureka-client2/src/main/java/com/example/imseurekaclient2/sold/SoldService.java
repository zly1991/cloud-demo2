package com.example.imseurekaclient2.sold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class SoldService {
    @Autowired
   private  RestTemplate template;
    public String queryClientHi(){
        //轮训展示
        return this.template.getForObject("http://SERVICE-HI/order/sayhi",String.class);
    }
}
