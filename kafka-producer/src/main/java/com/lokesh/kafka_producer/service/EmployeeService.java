package com.lokesh.kafka_producer.service;

import com.lokesh.kafka_producer.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList;

    EmployeeService(){
        this.employeeList = new ArrayList<>();
    }

    public Employee createEmployee(Employee employee) {
        employee.setId(generateId());
        employeeList.add(employee);
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
