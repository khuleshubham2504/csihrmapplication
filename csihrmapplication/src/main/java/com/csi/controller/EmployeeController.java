package com.csi.controller;

import com.csi.service.EmployeeServiceImpl;
import com.csi.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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

        employeeService.signIn(employeeEmailId, employeePassword);
        return ResponseEntity.ok("<<<<<<<<<<<<<<--SIGN_IN SUCCESSFULL-->>>>>>>>>>>>>>");
    }

    @GetMapping("/getdatabyemailid/{employeeEmailId}")

    public Employee getDataByEmployeeEmailId(@PathVariable String employeeEmailId) {
        return employeeService.getDataByEmployeeEmailId(employeeEmailId);
    }

    @GetMapping("/getalldata")
    public List<Employee> getAllData() {
        return employeeService.getAllData();
    }

    @GetMapping("/getdatabydob/{employeeDOB}")
    public Employee getDataByEmployeeDOB(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date employeeDOB) {
        return employeeService.getDataByEmployeeDOB(employeeDOB);
    }

<<<<<<< HEAD
    @PostMapping("/getdatabyanyinput")
    public List<Employee> getDataByAnyInput(@RequestBody Employee employee)
    {
        return employeeService.getDataByAnyInput(employee);
    }

=======
    @DeleteMapping("/deletedata/{employeeId}")
    public String deleteEmployeeData(@PathVariable long employeeId) {
        employeeService.deleteEmployeeData(employeeId);
        return "delete Data done";
    }

    @DeleteMapping("/deletealldata")
    public String deleteEmployeeData() {
        employeeService.deleteEmployeeAllData();
        return "delete Data done";

>>>>>>> 9f9484566adb4691c8265a9d0972ed3cfc33c5ba

    }
    @PutMapping("/updatedata/{employeeId}")
    public Employee updeateEmployeeData(@PathVariable long employeeId, @RequestBody Employee employee){
       return employeeService.updateEmployeeData(employee);

    }
}