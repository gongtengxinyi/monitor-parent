package com.monitor.data.main;

import com.google.gson.Gson;
import com.monitor.data.pojo.Order;
import com.monitor.data.rabbitmq.Producer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
@WebAppConfiguration

public class mainloader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-spring-mybatis.xml");
        ctx.refresh();
        ctx.start();
        Producer producer = ctx.getBean(Producer.class);
        try {
            Gson gson =new Gson();
            Order order =new Order();
            order.setId(1l);
            order.setPayment("dd");
            order.setCloseTime(new Date());
            order.setBuyerNick("dd");
            String s = gson.toJson(order);
            producer.sendMessage(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("service started");
        Boolean wait = true;
        while (wait) {
            String result = scan.nextLine();
            while (!result.equals("stop")) {
                System.out.println("service continue");
                result = scan.nextLine();
            }
            System.out.println("are you sure stop services?");
            result = scan.nextLine();
            if (!result.equals("y")) {
                System.out.println("service continue");
                continue;
            }
            wait = false;
        }
        System.out.println("service end");
        ctx.close();
        scan.close();
    }
}
