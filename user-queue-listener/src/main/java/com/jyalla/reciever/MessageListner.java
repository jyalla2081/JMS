package com.jyalla.reciever;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {

    @RabbitListener(queues = "2081-queue1")
    public void listner(CustomMessage message) {
        System.out.println("Recieved MEssage is: " + message);
    }
}
