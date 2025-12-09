package com.sy.QueryExamples.Service;


import com.sy.QueryExamples.Entity.EmployeeDetails;
import com.sy.QueryExamples.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repo;

    public EmployeeDetails save(EmployeeDetails e){
        return repo.save(e);
    }

    public List<EmployeeDetails> getAll(){
        return repo.getAllEmployee();
    }

    public EmployeeDetails searchByEmail(String email){
        return repo.findByEmail(email);
    }


}
