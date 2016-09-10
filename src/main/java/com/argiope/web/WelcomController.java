package com.argiope.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiang on 16/7/9.
 */
@Controller
@RequestMapping("/welcom")
public class WelcomController {
    @RequestMapping("/data")
    @ResponseBody
    public Map hello(){
        Map map  = new HashMap();
        map.put("code",200);
        map.put("success",true);
        map.put("data",2222);
        return map;
    }

    public String ss(){
        System.out.print("");
        System.out.print("ssssssss");
        return "";
    }

}
