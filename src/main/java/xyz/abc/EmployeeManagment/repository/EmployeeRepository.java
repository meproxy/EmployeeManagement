package xyz.abc.EmployeeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.abc.EmployeeManagment.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
