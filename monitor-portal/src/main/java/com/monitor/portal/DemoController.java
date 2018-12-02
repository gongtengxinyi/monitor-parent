package com.monitor.portal;

import com.monitor.data.redis.JedisClientSingle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @Autowired
    private JedisClientSingle jedisClientSingle;
    @RequestMapping("hello")
    @ResponseBody
    public String getIndex() {
        String ddd = jedisClientSingle.get("ddd");
        return "nihao";
    }
}
