package com.csi.dao;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee signUp(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public boolean signIn(String employeeEmailId, String employeePassword) {

        boolean status=false;

        List<Employee> empList=employeeRepository.findAll();

        for (Employee e:empList)
        {
            if (e.getEmployeeEmailId().equals(employeeEmailId) && e.getEmployeePassword().equals(employeePassword)){
                status=true;
            }
        }
        return status;
    }


}
