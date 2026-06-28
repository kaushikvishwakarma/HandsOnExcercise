package com.employee.management.repository;

import com.employee.management.domain.Department;
import com.employee.management.view.DepartmentSummaryView;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByCode(String code);

    DepartmentSummaryView findProjectedByCode(String code);
}