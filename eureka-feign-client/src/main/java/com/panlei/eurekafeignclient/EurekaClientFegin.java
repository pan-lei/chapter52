package com.panlei.eurekafeignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pan_l
 * @ClassName EurekaClientFegin
 * @Description
 * @date 2019-06-24 19:47
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFegin {
    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
