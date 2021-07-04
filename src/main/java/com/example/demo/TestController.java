package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xianmeng.jiang
 * @create 2021-04-18
 */
@RestController
public class TestController {

    @GetMapping("/hi")
    public String HiController(){
        return "hi test controller";
    }
}
