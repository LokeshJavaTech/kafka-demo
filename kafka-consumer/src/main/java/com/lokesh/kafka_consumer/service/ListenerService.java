package com.lokesh.kafka_consumer.service;

import com.lokesh.kafka_consumer.event.EmployeeCreateEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {

    @KafkaListener(topics = "create-employee-topic")
    public void createEmployeeTopicListener(EmployeeCreateEvent employeeCreateEvent) {
        System.out.println("On topic: create-employee-topic, Consumed event: "+employeeCreateEvent);
    }


}
