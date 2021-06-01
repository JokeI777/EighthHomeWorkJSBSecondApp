package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.function.Consumer;

@Service
public class ConsumerReceivedMessages {

    static final Logger logger = LoggerFactory.getLogger("ReceivedMessageFromFirstApp");
    @Autowired
    SendService sendService;

    @Bean
    public Consumer<ReceivedMessage> provide(){

        return consumed -> {
            logger.info(consumed.getId().toString() + " Received!");
            sendService.send(new SendMessage(consumed.getId(), "VALID", LocalDateTime.now().toString(), "test"));
            logger.info("Sent!!!");};
    }
}
