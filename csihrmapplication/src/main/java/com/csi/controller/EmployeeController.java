package com.csi.controller;

import com.csi.service.EmployeeServiceImpl;
import com.csi.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/signup")
    public ResponseEntity<Employee> signUp(@RequestBody Employee employee) {

        return ResponseEntity.ok(employeeService.signUp(employee));
    }

    @GetMapping("/signin/{employeeEmailId}/{employeePassword}")
    public ResponseEntity<String> signIn(@PathVariable String employeeEmailId, @PathVariable String employeePassword) {

        employeeService.signIn(employeeEmailId,employeePassword);
        return ResponseEntity.ok("<<<<<<<<<<<<<<--SIGN_IN SUCCESSFULL-->>>>>>>>>>>>>>");
    }


}
