package com.monitor.data.service;

import com.monitor.data.api.CommonService;
import com.monitor.data.dao.OrderDao;
import com.monitor.data.pojo.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service(value = "commonService")
public class CommonServiceImpl implements CommonService {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Autowired
    private OrderDao orderDao;
    public String getUserTest() {
        logger.info(">>>>>>>>>>>>>>>>start>>>>>>>>>>>");
        Order order =new Order();
        order.setId(17l);
        order.setUserId(12l);
        order.setBuyerMessage("mudjaldjfa");
        order.setBuyerNick("dddddad");
        order.setCloseTime(new Date());
        order.setPayment("ddadafads");
        int one = orderDao.insertByOrder(order);
        logger.info("插入order数据成功{}",order);
        return "";
    }
}
