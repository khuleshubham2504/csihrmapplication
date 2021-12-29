package com.csi.service;

import com.csi.model.Employee;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee signUp(Employee employee);
    public boolean signIn(String employeeEmailId, String employeePassword);
    public Employee getDataByEmployeeEmailId(String employeeEmailId);
    public List<Employee> getAllData();
    public Employee getDataByEmployeeDOB(Date employeeDOB);
    public void deleteEmployeeData(long employeeId);
    public List<Employee> getDataByAnyInput(Employee employee);
    public Employee updateEmployeeData(Employee employee);



public void deleteEmployeeAllData();

    Optional<Employee> getEmployeeDataById(Long employeeId);
}
