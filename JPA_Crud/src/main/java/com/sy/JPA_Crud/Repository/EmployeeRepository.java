package com.sy.JPA_Crud.Repository;

import com.sy.JPA_Crud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

     List<Employee> findByNameOrEmail(String name, String email);
}
