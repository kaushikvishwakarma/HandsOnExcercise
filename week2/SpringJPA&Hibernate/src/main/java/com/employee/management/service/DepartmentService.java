package com.employee.management.service;

import com.employee.management.domain.Department;
import com.employee.management.repository.DepartmentRepository;
import com.employee.management.view.DepartmentSummaryView;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public DepartmentSummaryView findSummaryByCode(String code) {
        return departmentRepository.findProjectedByCode(code);
    }
}