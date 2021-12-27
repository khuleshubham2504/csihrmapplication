package com.csi.service;
import com.csi.dao.EmployeeDaoImpl;

import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDaoImpl employeeDao;
    @Override
    public Employee signUp(Employee employee) {
        return employeeDao.signUp(employee);
    }

    @Override
    public boolean signIn(String employeeEmailId, String employeePassword) {
        return employeeDao.signIn(employeeEmailId,employeePassword);
    }
}
