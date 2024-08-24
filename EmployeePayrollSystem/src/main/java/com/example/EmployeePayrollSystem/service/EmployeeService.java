package com.example.EmployeePayrollSystem.service;

import com.example.EmployeePayrollSystem.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(Long employeeId);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Long employeeId, Employee employeeDetails);

    public void deleteEmployee(long employeeId);
}
