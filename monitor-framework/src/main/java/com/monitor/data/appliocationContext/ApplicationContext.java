package com.monitor.data.appliocationContext;

import com.monitor.data.pojo.User;
import org.apache.commons.lang.StringUtils;

/**
 * 用户信息存储类
 */
public class ApplicationContext {
    private static final ThreadLocal<User> session = new ThreadLocal<User>();
    private static final ThreadLocal<Long> userId = new ThreadLocal<Long>();

    public static User getUser() {
        return session.get();
    }

    public static void setUser(User user) {
        session.set(user);
        userId.set(user.getId());
    }

    public static Long getCompanyId() {
        return userId.get();
    }

    public static void setCompanyId(Long id) {
        userId.set(id);
    }


    public static void clear() {
        session.remove();
        userId.remove();
    }
}
