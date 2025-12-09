package com.sy.QueryExamples.Repository;

import com.sy.QueryExamples.Entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepository extends JpaRepository<EmployeeDetails,Integer> {

    @Query("SELECT e FROM EmployeeDetails e")
    List<EmployeeDetails> getAllEmployee();


    @Query(value = "SELECT * FROM employee_details where email = :email",nativeQuery = true)
    EmployeeDetails findByEmail(String email);

}
