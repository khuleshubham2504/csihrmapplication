package com.csi.dao;
import com.csi.model.Employee;

import java.util.List;

public interface EmployeeDao {

public Employee signUp(Employee employee);
public boolean signIn(String employeeEmailId, String employeePassword);
public Employee getDataByEmployeeEmailId(String employeeEmailId);
public List<Employee> getAllData();

}