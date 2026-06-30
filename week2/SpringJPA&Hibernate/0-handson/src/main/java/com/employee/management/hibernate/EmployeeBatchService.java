package com.employee.management.hibernate;

import com.employee.management.domain.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class EmployeeBatchService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveAll(List<Employee> employees) {
        Session session = entityManager.unwrap(Session.class);
        for (int index = 0; index < employees.size(); index++) {
            session.persist(employees.get(index));
            if (index > 0 && index % 20 == 0) {
                session.flush();
                session.clear();
            }
        }
    }
}