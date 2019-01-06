package com.monitor.data.rabbitmq;

import com.google.gson.Gson;
import com.monitor.data.pojo.Order;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class RabbitHanderMessager {
    private static Logger logger = LoggerFactory.getLogger(RabbitHanderMessager.class);
    public void handleOrderMessage(long deliveryTag, Channel channel, String receiveMessage) {
        try {
            Gson gson =new Gson();
            Order order = gson.fromJson(receiveMessage, Order.class);
            System.out.println("d");
        } catch (Exception e) {
            //
            logger.info("消息消费失败,消息体{},开始重新放回队列中.",receiveMessage);
            try {
                channel.basicNack(deliveryTag, false, true);
            } catch (IOException e1) {
                logger.info("消息重新放回队列失败,消息体{}",receiveMessage);
                e1.printStackTrace();
            }
            logger.info("消息重新放回队列成功,消息体是{}",receiveMessage);
            e.printStackTrace();
        }

    }
}
