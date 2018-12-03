package com.monitor.data.handlerinterceptor;

import com.google.gson.Gson;
import com.monitor.data.api.UserService;
import com.monitor.data.appliocationContext.ApplicationContext;
import com.monitor.data.jedis.JedisClientSingle;
import com.monitor.data.pojo.User;
import com.monitor.data.splitTable.ContextHelper;
import com.monitor.data.util.PropertiesUtil;
import com.sky.utils.CookieUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 */
@Component
public class LoginInterceptor  implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //从cookie中获取登录的userJson
        String userJson = CookieUtils.getCookieValue(httpServletRequest, CookieUtils.USER_COOKIE);
        if(userJson==null){
            // sysConfig.properties(配置文件)
            PropertiesUtil p = new PropertiesUtil("important.properties");
            String loginUrl = (String) p.getProperties().get("LOGIN_URL");
            httpServletResponse.sendRedirect(loginUrl);
            return false;
        }else {
            Gson gson =new Gson();
            User user = gson.fromJson(userJson, User.class);
            UserService userService = ContextHelper.getUserService();
            //获取登录的账号的userId 放到线程变量里
            User userLogin = userService.getUserByLoginName(user);
            //threadLocal 存储用户信息
            ApplicationContext.setUser(userLogin);
            return true;
        }
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
