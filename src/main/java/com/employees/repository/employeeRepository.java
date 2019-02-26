package com.employees.repository;

import com.employees.model.employeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

@Repository
public interface employeeRepository extends JpaRepository<employeeModel, Integer> {

}
