package com.lokesh.kafka_producer;

import org.springframework.boot.SpringApplication;

public class TestKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.from(KafkaProducerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
