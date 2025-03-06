package com.lokesh.kafka_producer.service;

import com.lokesh.kafka_producer.event.EmployeeCreateEvent;
import com.lokesh.kafka_producer.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList;

    @Autowired
    private KafkaTemplate<String, EmployeeCreateEvent> kafkaTemplate;

    EmployeeService(){
        this.employeeList = new ArrayList<>();
    }

    public Employee createEmployee(Employee employee) {
        employee.setId(generateId());
        employeeList.add(employee);

        EmployeeCreateEvent employeeCreateEvent = new EmployeeCreateEvent(employee.getId(), employee.getName());
        kafkaTemplate.send("create-employee-topic", employeeCreateEvent);
        System.out.println("On topic: create-employee-topic, send event: "+employeeCreateEvent);

        return employee;
    }

    public Employee getEmployeeId(int id) {
        return employeeList.stream().filter(e -> e.getId() == id).findAny().orElse(null);
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }

    private int generateId(){
        return (int) (Math.random() * 100000);
    }

}
