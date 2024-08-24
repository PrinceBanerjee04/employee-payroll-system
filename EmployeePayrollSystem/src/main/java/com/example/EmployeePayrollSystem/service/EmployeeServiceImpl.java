package com.example.EmployeePayrollSystem.service;

import com.example.EmployeePayrollSystem.model.Employee;
import com.example.EmployeePayrollSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new NoSuchElementException("Employee id number" + employeeId +" not found"));
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new NoSuchElementException("Employee id number" + employeeId +" not found"));


        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long employeeId) {
        if(!employeeRepository.existsById(employeeId)){
            throw new NoSuchElementException("Employee id number" + employeeId +" not found");
        }
        employeeRepository.deleteById(employeeId);
    }
}
