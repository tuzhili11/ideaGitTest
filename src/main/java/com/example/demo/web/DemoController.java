package com.example.demo.web;

import com.example.demo.entity.ConnectionSettings;
import com.example.demo.entity.neo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ideaGitTest
 * @Description:
 * @Author: tuzhili
 * @Date: 2018/4/17 10:58
 * @Version:1.1.0
 * @Copyright:Copyright (c) 浙江蘑菇加电子商务有限公司 2017 ~ 2018 版权所有
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    neo neo1;
    @Autowired
    ConnectionSettings connectionSettings;
    @RequestMapping("/hello")
    public String hello(){
        return connectionSettings.getPassword()+"////"+connectionSettings.getRemoteAddress()+"////"+connectionSettings.getUsername();
    }
}
