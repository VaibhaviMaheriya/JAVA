package com.sy.MiniJPAproject.Controller;


import com.sy.MiniJPAproject.Entity.Employee;
import com.sy.MiniJPAproject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    public EmployeeService service;

    @PostMapping
    public Employee insertEmployee(@RequestBody Employee emp) {
        return service.add(emp);
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee e){
        return service.updateById(id,e);
    }

    @PatchMapping("/{id}")
    public Employee partialUpdate(@PathVariable Integer id, @RequestBody Map<String,Object> obj){
        return service.partiallyUpdateById(id,obj);
    }

}
