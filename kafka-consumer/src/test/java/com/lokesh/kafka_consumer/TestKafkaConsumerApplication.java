package com.lokesh.kafka_consumer;

import org.springframework.boot.SpringApplication;

public class TestKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.from(KafkaConsumerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
