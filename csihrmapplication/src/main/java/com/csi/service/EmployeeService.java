package com.csi.service;

import com.csi.model.Employee;

public interface EmployeeService {
    public Employee signUp(Employee employee);
    public boolean signIn(String employeeEmailId, String employeePassword);
}
