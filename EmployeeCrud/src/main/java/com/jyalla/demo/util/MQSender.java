package com.jyalla.demo.util;

import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jyalla.demo.config.RabbitMqYamlConfig;
import com.jyalla.demo.modal.MqMessage;

@Component
public class MQSender {

    private static Logger logger = LoggerFactory.getLogger(MQSender.class);

    @Autowired
    RabbitTemplate template;

    @Autowired
    RabbitMqYamlConfig rabbitYaml;

    public void sendMessage(MqMessage message) {
        message.setId(UUID.randomUUID()
                .toString());
        System.out.println(rabbitYaml);
        System.out.println(message);
        message.setTimestamp(new Date());
        logger.info("rabbitYaml is {}", rabbitYaml);
        logger.info("message is {}", message);
        template.convertAndSend(rabbitYaml.getExchange(), rabbitYaml.getQueue(), "Hello World");

    }

}
