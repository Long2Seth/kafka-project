package com.example.kafkadockercompose;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
@AllArgsConstructor
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void publishMessage(@RequestBody MessageRequest messageRequest) {
        kafkaTemplate.send("3", messageRequest.message());
    }
}
