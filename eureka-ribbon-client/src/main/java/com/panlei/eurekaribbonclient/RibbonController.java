package com.panlei.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pan_l
 * @ClassName RibbonController
 * @Description
 * @date 2019-06-21 20:17
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonSerivce ribbonSerivce;
    @GetMapping("/hi")
    public String hi(@RequestParam(required=false,defaultValue = "panlei")String name) {
        return ribbonSerivce.hi(name);
    }
}
