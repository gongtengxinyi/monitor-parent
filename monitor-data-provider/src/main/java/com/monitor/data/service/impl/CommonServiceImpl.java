package com.monitor.data.service.impl;

import com.monitor.data.api.CommonService;
import com.monitor.data.dao.SecurityMapper;
import com.monitor.data.pojo.Security;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "commonService")
public class CommonServiceImpl implements CommonService {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SecurityMapper securityMapper;
    public String getUserTest() {
        logger.info("进入master方法");
        Security security = securityMapper.selectByPrimaryKey("1");
        logger.info("进入slave方法");
        Security security1 = securityMapper.selectByPrimaryKey2("2");
        return "";
    }
}
