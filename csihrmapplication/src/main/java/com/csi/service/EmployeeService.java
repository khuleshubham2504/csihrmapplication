package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee signUp(Employee employee);
    public boolean signIn(String employeeEmailId, String employeePassword);
    public Employee getDataByEmployeeEmailId(String employeeEmailId);
    public List<Employee> getAllData();
}
