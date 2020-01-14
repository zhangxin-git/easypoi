package com.mr.zxy.easypoi.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassNameRedirectController
 * @Description: TOOD
 * @Author zhangxinyu
 * @Date 2020/1/9
 * @Version V1.0
 **/
@Controller
public class RedirectController {

    @GetMapping(value = "/")

    public String toIndex(){

        return "index";
    }

}
