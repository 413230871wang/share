package com.lay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lay on 2018/5/4.
 */
@Controller
public class TestController {

    /**
     * @GetMapping 标签是requestMapping 和 RequestMethod.GET方式的缩写
     * @return
     */
    @GetMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }

    @RequestMapping("/getBaiduMap")
    public String getBaiduMap(){
        String printW = "跳到这里来了！";
        System.out.println(printW);
        return "baiduMap";
    }

    /**
     * 地图展示
     * @return
     */
    @RequestMapping("/mapShow")
    public String mapShow(){
        return "mapShow";
    }
}
