package com.monitor.data.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class Consumer implements MessageListener {
    private static Logger logger = LoggerFactory.getLogger(Consumer.class);
    public void onMessage(Message message) {
        logger.info("consumer receive message------->:{}", message);
    }
}
