package kz.iitu.fullstack.midterm_spring_vue.repository;

import kz.iitu.fullstack.midterm_spring_vue.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
