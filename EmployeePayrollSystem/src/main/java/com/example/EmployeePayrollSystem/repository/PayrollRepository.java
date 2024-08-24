package com.example.EmployeePayrollSystem.repository;

import com.example.EmployeePayrollSystem.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long> {

    //select * from payroll as p inner joining employee as e
    //where e.id = p.employee_id

    List<Payroll> findByEmployeeId(Long employeeId);

    Payroll findByEmployeeIdAndPayPeriod(Long employeeId, String payPeriod);

    @Query("select case when count(p) > 0 then true else false and from Payroll p where p.payPeriod = :payPeriod")
    Boolean existsByPayPeriod(@Param("payPeriod") String payPeriod);
}
