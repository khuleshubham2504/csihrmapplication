package com.csi.controller;

import com.csi.exception.RecordNotFoundException;
import com.csi.repository.EmployeeRepository;
import com.csi.service.EmployeeServiceImpl;
import com.csi.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

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

    public Employee getDataByEmployeeEmailId(@PathVariable String employeeEmailId){

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

    @GetMapping("/getemployeedata/{employeeId}")
    public Optional<Employee> getEmployeeDataById(@PathVariable Long employeeId){
        return employeeService.getEmployeeDataById(employeeId);
    }


    @PostMapping("/getdatabyanyinput")
    public List<Employee> getDataByAnyInput(@RequestBody Employee employee)
    {
        return employeeService.getDataByAnyInput(employee);
    }


    @DeleteMapping("/deletedata/{employeeId}")
    public String deleteEmployeeData(@PathVariable long employeeId) {
        employeeService.deleteEmployeeData(employeeId);
        return "delete Data done";
    }

    @DeleteMapping("/deletealldata")
    public String deleteEmployeeData() {
        employeeService.deleteEmployeeAllData();
        return "delete Data done";



    }
    @PutMapping("/updatedata/{employeeId}")
    public Employee updeateEmployeeData(@PathVariable long employeeId, @RequestBody Employee employee) throws RecordNotFoundException {

        Employee emp=employeeRepository.findById(employeeId).orElseThrow(()-> new RecordNotFoundException("Employee Id does not available"));

       return employeeService.updateEmployeeData(employee);

    }
}