package com.example.kafkadockercompose.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic top() {
        return TopicBuilder.name("3")
                .partitions(2)
                .replicas(2)
                .build();
    }

}
