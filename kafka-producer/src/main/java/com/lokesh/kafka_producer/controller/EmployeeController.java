package com.lokesh.kafka_producer.controller;

import com.lokesh.kafka_producer.model.Employee;
import com.lokesh.kafka_producer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        return ResponseEntity.ok(employeeService.getEmployeeId(id));
    }

    @GetMapping()
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(employeeService.getEmployees());
    }

}
