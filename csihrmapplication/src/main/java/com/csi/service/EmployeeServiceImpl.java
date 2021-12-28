package com.csi.service;
import com.csi.dao.EmployeeDaoImpl;

import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public Employee getDataByEmployeeEmailId(String employeeEmailId) {
        return employeeDao.getDataByEmployeeEmailId(employeeEmailId);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeDao.getAllData();
    }

    @Override
    public Employee getDataByEmployeeDOB(Date employeeDOB) {
        return employeeDao.getDataByEmployeeDOB(employeeDOB);
    }



    @Override
    public void deleteEmployeeData(long employeeId) {
        employeeDao.deleteEmployeeData(employeeId);

    }



    public void deleteEmployeeAllData() {
        employeeDao.deleteEmployeeAllData();
    }
}
