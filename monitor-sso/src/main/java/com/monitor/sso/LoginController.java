package com.monitor.sso;

import com.monitor.data.Response.MonitorResponse;
import com.monitor.data.api.UserService;
import com.monitor.data.jedis.JedisClientSingle;
import com.monitor.data.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("sso")
public class LoginController {
    @Autowired
    private JedisClientSingle jedisClientSingle;
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    @ResponseBody
    public MonitorResponse login(@RequestBody User user, HttpServletResponse response) {
      return  userService.login(user,response);
    }

    @RequestMapping("getUserLoginToken")
    @ResponseBody
    public MonitorResponse getUserLoginToken(@RequestBody User user) {
        return  userService.getUserLoginToken(user);
    }
}
