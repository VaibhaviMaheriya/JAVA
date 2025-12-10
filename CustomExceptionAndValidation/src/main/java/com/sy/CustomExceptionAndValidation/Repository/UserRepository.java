package com.sy.CustomExceptionAndValidation.Repository;

import com.sy.CustomExceptionAndValidation.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
