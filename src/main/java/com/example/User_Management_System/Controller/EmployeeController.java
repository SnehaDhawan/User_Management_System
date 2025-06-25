package com.example.User_Management_System.Controller;


import com.example.User_Management_System.Model.Employee;
import com.example.User_Management_System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping ("/getAll")
     public List<Employee> GetAllEmployee()
    {
        return employeeRepository.findAll();
    }


}
