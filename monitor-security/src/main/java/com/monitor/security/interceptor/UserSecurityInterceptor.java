package com.monitor.security.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.monitor.data.domain.ErrorResponse;
import com.monitor.data.pojo.Security;
import com.monitor.utils.JsonUtil;
import com.monitor.utils.ReturnCode;

public class UserSecurityInterceptor implements HandlerInterceptor {
    private static ClassPathXmlApplicationContext context = null;

    private ClassPathXmlApplicationContext getContext() {
        if (context == null) {
            synchronized (UserSecurityInterceptor.class) {
                if (context == null) {
                    context = new ClassPathXmlApplicationContext(new String[]{"dubbo-services.xml"});
                    context.refresh();
                    context.start();
                }
            }
        }
        return context;
    }

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
    }

    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        // TODO Auto-generated method stub
        String secret_key = arg0.getParameter("secret_key");
        ErrorResponse errorResponse = new ErrorResponse();
        getContext();
        return true;
    }
}
