package com.employee.management.runner;

import com.employee.management.domain.Department;
import com.employee.management.domain.Employee;
import com.employee.management.repository.DepartmentRepository;
import com.employee.management.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataSeeder(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {
        Department engineering = new Department();
        engineering.setName("Engineering");
        engineering.setCode("ENG");
        departmentRepository.save(engineering);

        Department humanResources = new Department();
        humanResources.setName("Human Resources");
        humanResources.setCode("HR");
        departmentRepository.save(humanResources);

        Employee employee = new Employee();
        employee.setFirstName("Ava");
        employee.setLastName("Brown");
        employee.setWorkEmail("ava.brown@company.com");
        employee.setJobTitle("Software Engineer");
        employee.setDepartment(engineering);
        employeeRepository.save(employee);
    }
}