package com.panlei.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pan_l
 * @ClassName HiService
 * @Description
 * @date 2019-06-24 19:53
 */
@Service
public class HiService {
    @Autowired
    private EurekaClientFegin eurekaClientFegin;

    public String sayHi(String name) {
        return eurekaClientFegin.sayHiFromClientEureka(name);
    }
}
