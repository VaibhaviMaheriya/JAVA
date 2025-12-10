package com.sy.ValidationAndExceptions.Repository;

import com.sy.ValidationAndExceptions.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
