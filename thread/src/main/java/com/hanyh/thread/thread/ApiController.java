package com.hanyh.thread.thread;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "start spring-boot success";
    }

}
