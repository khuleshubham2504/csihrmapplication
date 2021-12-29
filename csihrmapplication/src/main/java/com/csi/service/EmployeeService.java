package com.csi.service;

import com.csi.model.Employee;

import java.util.Date;
import java.util.List;

public interface EmployeeService {
    public Employee signUp(Employee employee);
    public boolean signIn(String employeeEmailId, String employeePassword);
    public Employee getDataByEmployeeEmailId(String employeeEmailId);
    public List<Employee> getAllData();
    public Employee getDataByEmployeeDOB(Date employeeDOB);
<<<<<<< HEAD
    public void deleteEmployeeData(long employeeId);
    public List<Employee> getDataByAnyInput(Employee employee);
=======
    public Employee updateEmployeeData(Employee employee);
>>>>>>> 9f9484566adb4691c8265a9d0972ed3cfc33c5ba

    public void deleteEmployeeData(long employeeId);


public void deleteEmployeeAllData();
}
