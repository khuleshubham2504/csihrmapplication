package com.csi.dao.test;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.repository.EmployeeRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {

    @Autowired
    EmployeeDaoImpl employeeDao;

    @MockBean
    EmployeeRepository employeeRepository;

    @org.junit.jupiter.

}
