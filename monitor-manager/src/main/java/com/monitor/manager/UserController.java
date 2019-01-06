package com.monitor.manager;

import com.monitor.data.Response.MonitorResponse;
import com.monitor.data.api.UserService;
import com.monitor.data.appliocationContext.ApplicationContext;
import com.monitor.data.dto.UserDto;
import com.monitor.data.jedis.JedisClientSingle;
import com.monitor.data.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("user")
@Controller
@Api(tags = "二：用户信息") //swagger分类标题注解
public class UserController {
    @Autowired
    private JedisClientSingle jedisClientSingle;
    @Autowired
    private UserService userService;
    @RequestMapping("getLoginInfo")
    @ResponseBody
    @ApiOperation(httpMethod = "GET", value = "个人登录信息")
    public MonitorResponse getLoginUser() {
        User user = ApplicationContext.getUser();
        return MonitorResponse.success(user);
    }
    @RequestMapping("userList")
    @ResponseBody
    @ApiOperation(httpMethod = "POST", value = "用户列表")
    public MonitorResponse userList(UserDto userDto) {
        List<User> userList = userService.findListByDto(userDto);
        return MonitorResponse.success(userList);
    }
}
