package com.panlei.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author pan_l
 * @ClassName RibbonSerivce
 * @Description
 * @date 2019-06-21 20:15
 */
@Service
public class RibbonSerivce {
    @Autowired
    RestTemplate restTemplate;

    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name="+name, String.class);
    }
}
