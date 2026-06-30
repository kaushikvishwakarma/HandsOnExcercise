package com.employee.management.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.domain.Department;
import com.employee.management.service.DepartmentService;
import com.employee.management.view.DepartmentSummaryView;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department create(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping
    public List<Department> list() {
        return departmentService.findAll();
    }

    @GetMapping("/search/summary/{code}")
    public DepartmentSummaryView summary(@PathVariable String code) {
        return departmentService.findSummaryByCode(code);
    }
}