package com.example.EmployeePayrollSystem.service;

import com.example.EmployeePayrollSystem.model.Employee;
import com.example.EmployeePayrollSystem.model.Payroll;
import com.example.EmployeePayrollSystem.repository.EmployeeRepository;
import com.example.EmployeePayrollSystem.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PayrollServiceImpl implements PayrollService{

    @Autowired
    private PayrollRepository payrollRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }

    @Override
    public Payroll getPayrollByEmployeeIdAndPayPeriod(Long employeeId, String payPeriod) {
        return payrollRepository.findByEmployeeIdAndPayPeriod(employeeId, payPeriod);
    }

    @Override
    public List<Payroll> getPayrollByEmployeeId(Long employeeId) {
        if(!employeeRepository.existsById(employeeId)){
            throw new NoSuchElementException("Employee id number" + employeeId +" not found");
        }
        return payrollRepository.findByEmployeeId(employeeId);
    }

    @Override
    public Payroll addPayroll(Long employeeId, Payroll payroll) {
        Payroll p = employeeRepository.findById(employeeId).map(employee -> {
            double grossPay = employee.getSalary() * 80;
            double netPay = grossPay * .8;
            payroll.setEmployee(employee);
            payroll.setGrossPay(grossPay);
            payroll.setNetPay(netPay);
            return payrollRepository.save(payroll);
        }).orElseThrow(() -> new NoSuchElementException("Employee id number " + employeeId + " not found"));
        return p;
    }

    @Override
    public Payroll updatePayroll(Long payrollId, Payroll payrollDetails) {
        Payroll payroll = payrollRepository.findById(payrollId).orElseThrow(() -> new NoSuchElementException("Payroll id " +payrollId+ " not found"));

        payroll.setGrossPay(!Double.isNaN(payrollDetails.getGrossPay()) ? payrollDetails.getGrossPay() : payroll.getGrossPay());
        payroll.setNetPay(!Double.isNaN(payrollDetails.getNetPay()) ? payrollDetails.getNetPay() : payroll.getNetPay());

        return payrollRepository.save(payroll);
    }
}
