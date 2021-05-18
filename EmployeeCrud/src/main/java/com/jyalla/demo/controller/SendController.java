package com.jyalla.demo.controller;

import java.util.Date;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jyalla.demo.modal.MqMessage;
import com.jyalla.demo.modal.User;
import com.jyalla.demo.util.MQSender;

@RestController
public class SendController {

    @Autowired
    MQSender sender;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody MqMessage message) {
        User user = new User(UUID.fromString("db47ce58-6f03-4d6d-9902-3837c925406d"), "dummyUser", "dummy@email.com", "1234", "", true, "Admin", new Date(),
                "$2a$04$8T6i2fjNU54gI8LgArCLEOP8XMMSw/.bq/iRhuL6Y.ha46NyKAMaq", 2);
        message.setbody(user);
        sender.sendMessage(message);
        return "Message Published!!";
    }
}
