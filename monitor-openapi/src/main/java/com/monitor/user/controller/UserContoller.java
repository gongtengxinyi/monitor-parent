package com.monitor.user.controller;

import com.monitor.data.api.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {
    @Autowired
    private CommonService commonService;
    @RequestMapping("getUserNameTest")
    public String getUser(){
       return commonService.getUserTest();
    }
}
