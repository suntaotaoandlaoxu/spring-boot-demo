package com.suntt.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: suntaotao
 * Date: 2019/8/23
 * Time: 14:55
 * Describe:
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
