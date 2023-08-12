package com.anlythree.anlykafka.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Slf4j
@Service
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic,String message) {
        // 发送消息
        kafkaTemplate.send(topic, message);
    }

}
