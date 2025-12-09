package com.sy.QueryExamples.Controller;


import com.sy.QueryExamples.Entity.EmployeeDetails;
import com.sy.QueryExamples.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class EmpController {

    @Autowired
    private EmpService service;

    @PostMapping
    public EmployeeDetails insertData(@RequestBody EmployeeDetails e){
        return service.save(e);
    }


    @GetMapping
    public List<EmployeeDetails> getAll(){
        return service.getAll();
    }

    @GetMapping("/{email}")
    public EmployeeDetails searchByEmailId(@PathVariable String email){
        return service.searchByEmail(email);
    }

}
