package com.jyalla.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.jyalla.rabbit.bean.MqMessage;

@Component
public class QueueListener {

    private static Logger logger = LoggerFactory.getLogger(QueueListener.class);

    @RabbitListener(queues = "2081-queue1")
    public void listen(MqMessage message) {
        logger.info("Message is: {}", message);
    }
}
