package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee signUp(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public boolean signIn(String employeeEmailId, String employeePassword) {

        boolean status = false;

        List<Employee> empList = employeeRepository.findAll();

        for (Employee e : empList) {
            if (e.getEmployeeEmailId().equals(employeeEmailId) && e.getEmployeePassword().equals(employeePassword)) {
                status = true;
            }
        }
        return status;
    }

    @Override
    public Employee getDataByEmployeeEmailId(String employeeEmailId) {
        return employeeRepository.findByEmployeeEmailId(employeeEmailId);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getDataByEmployeeDOB(Date employeeDOB) {
        return employeeRepository.findByEmployeeDOB(employeeDOB);
    }



    @Override
    public void deleteEmployeeData(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public void deleteEmployeeAllData() {
        employeeRepository.deleteAll();

    }




}
