package com.employees.controller;

import com.employees.model.employeeModel;
import com.employees.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employees.services.employeeService;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class employeeController {

    @Autowired
    private employeeRepository employeeRepo;

    @RequestMapping(value = "employees")
    public List<employeeModel> findAll(){
        List<employeeModel> empModel;
        empModel = employeeRepo.findAll();
        return empModel;
    }


    //get


    //set


}
