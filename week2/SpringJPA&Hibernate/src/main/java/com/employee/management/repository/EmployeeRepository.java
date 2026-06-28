package com.employee.management.repository;

import com.employee.management.domain.Employee;
import com.employee.management.view.EmployeeSummaryView;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByLastName(String lastName);

    Page<Employee> findByJobTitleContaining(String jobTitle, Pageable pageable);

    List<Employee> findByDepartment_Code(String code);

    EmployeeSummaryView findSummaryByWorkEmail(String workEmail);
}