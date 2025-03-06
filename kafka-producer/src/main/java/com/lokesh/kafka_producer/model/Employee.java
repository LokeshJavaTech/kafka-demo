package com.lokesh.kafka_producer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private String name;
}
