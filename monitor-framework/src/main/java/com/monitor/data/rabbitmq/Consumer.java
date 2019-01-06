package com.monitor.data.rabbitmq;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Date;

/**
 * 特点：只有服务端收到确认信号
 * 即channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
 * 确认成功，消息才会移除，确认成功后不管后面是异常还是断开服务消息已经被移除了。
 * 如果在确认之前抛出异常，消息不会移除，也不会重试，监听程序会因为异常停止不再处理消息   
 *  ，如果此时断开服务，消息重新回到队列。
 *
 添加了配置 acknowledge="auto"，这里来配置mq的确认机制，auto 自动确认，这也是默认缺省的配置。
 特点：消费者挂掉，
 待ack的消息回归到队列中。
 消费者抛出异常，消息会不断的被重发，直到处理成功。
 不会丢失消息，即便服务挂掉，没有处理完成的消息会重回队列，但是异常会让消息不断重试。


 正确的消息被ack 了，
 那么在消费过程中有异常了怎么办，
 这条消费肯定就不能返回ack应答了，
 这时就需要channel.basicNack方法了，
 这个方法解决了消费异常情况下该条消息怎么处理，
 有两种办法：第一，这条消息重新放回队列重新消费，
 第二，抛弃此条消息。那么具体使用哪个方法，
 这种情况下，建议捕捉异常类型，判断是哪种异常，再做具体处理。
 ---------------------

 */
public class Consumer implements ChannelAwareMessageListener {
    private static Logger logger = LoggerFactory.getLogger(Consumer.class);
@Autowired
private RabbitHanderMessager rabbitHanderMessager;
    public void onMessage(Message message, Channel channel) {

        try {
            long deliveryTag = message.getMessageProperties().getDeliveryTag();
            if(message==null){
                logger.info("消息体mesage为空");
                return;
            }
            String receiveMessage=new String(message.getBody());
            logger.info("接收到消息{}，消息体是{}",deliveryTag,receiveMessage);
            //确认
            channel.basicAck(deliveryTag, false);
            long startTime=System.currentTimeMillis();   //获取开始时间
            logger.info(" >>>>>>>>>>>>>消费{},时间{}开始",receiveMessage,new Date());
            rabbitHanderMessager.handleOrderMessage(deliveryTag,channel,receiveMessage);
            long endTime=System.currentTimeMillis(); //获取结束时间
            logger.info(" >>>>>>>>>>>>>消费{},时间{}结束。耗时{}ms",receiveMessage,new Date(),(endTime-startTime));
            //否认 调用basicNack后，会收到rabbitmq重发的消息
            //channel.basicNack(deliveryTag, false, true);
            //重新放入队列
            //channel.basicNack(envelope.getDeliveryTag(), false, true);
            //抛弃此条消息
            //channel.basicNack(envelope.getDeliveryTag(), false, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
