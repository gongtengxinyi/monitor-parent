package com.monitor.manager;

import com.monitor.data.Response.MonitorResponse;
import com.monitor.data.jedis.JedisClientSingle;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "二：用户信息") //swagger分类标题注解
public class DemoController {
    @Autowired
    private JedisClientSingle jedisClientSingle;
    @RequestMapping("hello")
    @ResponseBody
    //swagger返回值注解
    @ApiResponses(value = {
     @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "0 成功,其它为错误,返回格式：{code:0,data[{}]},data中的属性参照下方Model", response = MonitorResponse.class) })
    @ApiOperation(httpMethod = "GET", value = "个人信息")//swagger 当前接口注解
    public String getIndex() {
        String ddd = jedisClientSingle.get("ddd");
        return "nihao";
    }
}
