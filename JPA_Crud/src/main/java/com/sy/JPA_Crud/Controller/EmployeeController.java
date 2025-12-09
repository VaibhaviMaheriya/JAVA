package com.sy.JPA_Crud.Controller;


import com.sy.JPA_Crud.Entity.Employee;
import com.sy.JPA_Crud.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee e){
        return service.save(e);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable Integer id){
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Employee updateById(@PathVariable Integer id, @RequestBody Employee e){
        return service.update(id,e);
    }

    @GetMapping("/search")
    public List<Employee> searchByNameOrEmail(@RequestParam(required = false) String name,
                                              @RequestParam(required = false) String email){
        return service.searchByNameOrEmail(name,email);
    }



}
