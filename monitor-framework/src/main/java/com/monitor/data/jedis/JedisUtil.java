package com.monitor.data.jedis;

/**
 * jedis 工具类 获取token
 */
public class JedisUtil {
    private static  final  String USER_LOGIN_TOKEN="TOKEN:LOGIN:";

    /**
     * 获取登录的user token
     * @param userId
     * @return
     */
    public  static  String getLoginToken(Long userId){
        return USER_LOGIN_TOKEN+String.valueOf(userId);
    }
}
