package com.employee.management.web;

import com.employee.management.domain.Employee;
import com.employee.management.service.EmployeeService;
import com.employee.management.view.EmployeeSummaryView;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> list() {
        return employeeService.findAll();
    }

    @GetMapping("/{employeeId}")
    public Employee get(@PathVariable Long employeeId) {
        return employeeService.findById(employeeId);
    }

    @PutMapping("/{employeeId}")
    public Employee update(@PathVariable Long employeeId, @RequestBody Employee employee) {
        employee.setId(employeeId);
        return employeeService.save(employee);
    }

    @DeleteMapping("/{employeeId}")
    public void delete(@PathVariable Long employeeId) {
        employeeService.deleteById(employeeId);
    }

    @GetMapping("/search/last-name/{lastName}")
    public List<Employee> findByLastName(@PathVariable String lastName) {
        return employeeService.findByLastName(lastName);
    }

    @GetMapping("/search/job-title")
    public Page<Employee> findByJobTitle(@RequestParam String jobTitle, Pageable pageable) {
        return employeeService.findByJobTitle(jobTitle, pageable);
    }

    @GetMapping("/search/summary/{workEmail}")
    public EmployeeSummaryView findSummaryByEmail(@PathVariable String workEmail) {
        return employeeService.findSummaryByEmail(workEmail);
    }
}