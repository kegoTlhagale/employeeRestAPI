package com.employees.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")

public class employeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotNull
    private int employee_ID;

    @NotBlank
    private String
    employee_name,
    employee_lastname,
    employee_email;

    @NotNull
    private int department_id;

    public employeeModel() {
    }

    public employeeModel(int employee_ID, String employee_name, String employee_lastname, int department_id) {
        this.employee_ID = employee_ID;
        this.employee_name = employee_name;
        this.employee_lastname = employee_lastname;
        this.employee_email = employee_email;
        this.department_id = department_id;
    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_lastname() {
        return employee_lastname;
    }

    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(int department_id) {
        this.employee_email = employee_email;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
