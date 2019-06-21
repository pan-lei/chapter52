package com.panlei.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pan_l
 * @ClassName HiController
 * @Description
 * @date 2019-06-20 17:42
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " +name+ ",i am from port:" + port;
    }
}
