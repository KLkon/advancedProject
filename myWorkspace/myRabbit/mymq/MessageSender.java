package com.hb.epca.web.controller.mymq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 */
@Component
public class MessageSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    private String routingKey;

    public AmqpTemplate getAmqpTemplate() {
        return amqpTemplate;
    }

    public void setAmqpTemplate(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    //生成请求
    public void sendDataToQueue(Object obj) {

        amqpTemplate.convertAndSend(this.routingKey, obj);
    }

}
