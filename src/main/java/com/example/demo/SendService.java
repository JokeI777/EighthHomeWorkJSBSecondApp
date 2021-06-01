package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    @Autowired
    StreamBridge streamBridge;

    public void send(SendMessage sendMessage){
        streamBridge.send("toStream-out-0", sendMessage);
    }
}
