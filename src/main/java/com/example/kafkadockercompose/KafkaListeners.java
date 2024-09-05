package com.example.kafkadockercompose;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(topics = "3" , groupId = "groupid")
    public void listener(String message) {
        System.out.println(" Listener received  " + message);
    }
}
