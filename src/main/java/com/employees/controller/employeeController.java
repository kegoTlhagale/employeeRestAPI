package com.employees.controller;

import com.employees.model.employeeModel;
import com.employees.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.employees.services.employeeService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class employeeController {

    @Autowired
    private employeeRepository employeeRepo;

    /** Get all employees */
    @GetMapping("employees")
    public List<employeeModel> all() {
        return employeeRepo.findAll();
    }

    /** Save/add an employee */
    @PostMapping("addemployee")
    public employeeModel newEmployee(@Valid @RequestBody employeeModel emp){
        return employeeRepo.save(emp);
    }

    /**Get an employee by id */
    @GetMapping("employee/{id}")
    public Optional<employeeModel> getbyid ( @PathVariable Integer id ) {
        return employeeRepo.findById(id);
        //.orElseThrow(() -> new EmployeeNotFoundException(id))
    }

    /** Delete an employee by id*/
    @DeleteMapping("deleteemployee/{id}")
    public void deletebyid(@PathVariable Integer id){
        employeeRepo.deleteById(id);
    }

    /** Update an employee */
    @PutMapping("updateemployee/{id}")
    public employeeModel update(@PathVariable Integer id, @RequestBody employeeModel newemployee) {
        return employeeRepo.findById(id)
                .map(employee -> {
                    employee.setEmployee_name(newemployee.getEmployee_name());
                    employee.setEmployee_lastname(newemployee.getEmployee_lastname());
                    employee.setEmployee_email(newemployee.getEmployee_email());
                    employee.setDepartment_id(newemployee.getDepartment_id());
                    return employeeRepo.save(employee);

                }).orElseGet(() -> {
                    newemployee.setEmployee_ID(id);
                    return employeeRepo.save(newemployee);
                });

    }


   /* @RequestMapping(value = "employees")
    public List<employeeModel> findAll(){
        List<employeeModel> empModel;
        empModel = employeeRepo.findAll();
        return empModel;
    }*/


    //get


    //set


}
