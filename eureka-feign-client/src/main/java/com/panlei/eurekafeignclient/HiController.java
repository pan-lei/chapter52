package com.panlei.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pan_l
 * @ClassName HiController
 * @Description
 * @date 2019-06-24 19:55
 */
@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "panlei",required = false) String name) {
        return hiService.sayHi(name);
    }}
