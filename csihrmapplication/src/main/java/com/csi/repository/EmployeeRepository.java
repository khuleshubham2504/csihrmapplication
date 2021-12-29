package com.csi.repository;
import com.csi.model.Employee;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Employee findByEmployeeEmailId(String employeeEmailId);


   public Employee findByEmployeeDOB(Date employeeDOB);

}
