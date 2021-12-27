package com.csi.dao;
import com.csi.model.Employee;

public interface EmployeeDao {

public Employee signUp(Employee employee);
public boolean signIn(String employeeEmailId, String employeePassword);

}
