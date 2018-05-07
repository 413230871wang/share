package com.lay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lay on 2018/5/4.
 */
@RestController
public class TestController {

    /**
     * @GetMapping 标签是requestMapping 和 RequestMethod.GET方式的缩写
     * @return
     */
    @GetMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }
}
