package com.example.EmployeePayrollSystem.service;

import com.example.EmployeePayrollSystem.model.Employee;
import com.example.EmployeePayrollSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(long employeeId) {

    }
}
