package com.employee.management.service;

import com.employee.management.domain.Employee;
import com.employee.management.repository.EmployeeRepository;
import com.employee.management.view.EmployeeSummaryView;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow();
    }

    public void deleteById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public List<Employee> findByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    public Page<Employee> findByJobTitle(String jobTitle, Pageable pageable) {
        return employeeRepository.findByJobTitleContaining(jobTitle, pageable);
    }

    public EmployeeSummaryView findSummaryByEmail(String workEmail) {
        return employeeRepository.findSummaryByWorkEmail(workEmail);
    }
}