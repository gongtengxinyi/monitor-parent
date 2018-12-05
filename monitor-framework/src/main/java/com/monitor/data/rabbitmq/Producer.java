package com.monitor.data.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;


public class Producer {
    private static Logger logger =LoggerFactory.getLogger(Producer.class);
    @Resource(name="amqpTemplate")
    private AmqpTemplate amqpTemplate;
    @Value("${ORDER_ROUTEING_KEY}")
    private String orderKey;
    public void sendMessage(Object message) throws IOException {
        logger.info("to send message:{}", message);
        amqpTemplate.convertAndSend(orderKey, message);
    }
}
