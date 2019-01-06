package com.monitor.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping("hello")
    @ResponseBody
    public String getUserlIHLFJADSKFJL() {

        return  "ddd";
    }
}
