package com.lokesh.kafka_producer.event;

public record EmployeeCreateEvent(int id, String name) {
    @Override
    public String toString() {
        return "EmployeeCreateEvent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
