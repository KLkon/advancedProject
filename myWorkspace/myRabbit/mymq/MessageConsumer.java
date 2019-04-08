package com.hb.epca.web.controller.mymq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 消息消费者
 */
@Component
@RabbitListener(queues = "epcaQueue")
public class MessageConsumer {

    @RabbitHandler
    public void createOrder(@Payload String body, @Headers Map<String,Object> headers) {
        //创建订单
        System.out.println("--------------------------");
        System.out.println("进入创建订单");
        System.out.println(body);
        System.out.println(headers);
    }

    public void updateGoodsjia() {
        // TODO Auto-generated method stub

    }
}
