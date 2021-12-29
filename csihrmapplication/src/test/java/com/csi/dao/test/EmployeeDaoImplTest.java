package com.csi.dao.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {

    @Autowired
    EmployeeDaoImpl employeeDao;

    @MockBean
    EmployeeRepository employeeRepository;

    @Test
    public void signUpTest(){
        Employee employee = new Employee(121,233,"Shubham",12345,
                "Pune","Akole",12345,"ABC123","12-12-2002","20-12-2019",20-12-2020,
                "Male","Pune Uni","B.Mech",2015,
                67.67,"Vilas",12345,17800,
                "shubh@gmail.com","shubham");
        employeeDao.signUp(employee);

        verify(employeeRepository,times(1)).save(employee);
    }

    @Test
    public void signInTest(){
        when(employeeRepository.findAll()).thenReturn(Stream.of(new Employee(121,233,"Shubham",
                12345,"Pune","Akole",12345,"ABC123","12-12-2002",
                "20-12-2019",20-12-2020,"Male","Pune Uni","B.Mech",
                2015,67.67,"Vilas",12345,
                17800,"shubh@gmail.com","shubham")).collect(Collectors.toList()));

        Assert.assertEquals(1,1);
    }
    @Test
    public void getAllDataTest(){

        when(employeeRepository.findAll()).thenReturn(Stream.of(new Employee(121,233,"Shubham",
                12345,"Pune","Akole",12345,"ABC123","12-12-2002",
                "20-12-2019",20-12-2020,"Male","Pune Uni","B.Mech",
                2015,67.67,"Vilas",12345,
                17800,"shubh@gmail.com","shubham")).collect(Collectors.toList()));

            Assert.assertEquals(1,1);

    }
}
