package com.monitor.data.service;

import com.google.gson.Gson;
import com.monitor.data.Response.MonitorResponse;
import com.monitor.data.api.UserService;
import com.monitor.data.dao.UserDao;
import com.monitor.data.dto.UserDto;
import com.monitor.data.jedis.JedisClientSingle;
import com.monitor.data.jedis.JedisUtil;
import com.monitor.data.pojo.User;
import com.sky.utils.CookieUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.Page;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger =LoggerFactory.getLogger(UserServiceImpl.class);
    @Value(value = "${LOGIN_EXPIRE}")
    private String expireTime;
    @Autowired
    private UserDao userDao;
    @Autowired
    private JedisClientSingle jedisClientSingle;
    @Override
    public MonitorResponse login(User user, HttpServletResponse response) {
        User userSearch =checkUserPasswd(user);
        try {
            Gson gson=new Gson();
            String loginToken = JedisUtil.getLoginToken(userSearch.getId());
            userSearch.setPassword(null);//清空密码
            String userJson = gson.toJson(userSearch);
            jedisClientSingle.set(loginToken,userJson);
            jedisClientSingle.expire(loginToken,Integer.parseInt(expireTime));
            CookieUtils.setCookie(response,CookieUtils.USER_COOKIE
                    ,userJson,Integer.parseInt(expireTime));
            logger.info("用户{}登录成功，成功写入token",user.getUsername());
            return  MonitorResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return MonitorResponse.error(userSearch,"登录写入token失败");
        }
    }

    @Override
    public MonitorResponse getUserLoginToken(User user) {
        Long userId = user.getId();

        return null;
    }

    private User checkUserPasswd(User user) {
        User userData=new User();
        return userData;
    }


    @Override
    public String echo(String message) {
        return null;
    }

    @Override
    public UserDto get(Long id) {
        return null;
    }

    @Override
    public Long insert(UserDto userDto) {
        return null;
    }

    @Override
    public Long insertByUser(UserDto userDto) {
        return null;
    }

    @Override
    public Long update(UserDto userDto) {
        return null;
    }

    @Override
    public Long updateByUser(UserDto userDto) {
        return null;
    }

    @Override
    public Long delete(UserDto userDto) {
        return null;
    }

    @Override
    public Long deleteByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public List<UserDto> findPageList(Page page, UserDto userDto) {
        return null;
    }

    @Override
    public List<UserDto> queryUser(UserDto userDto) {
        return null;
    }


}
