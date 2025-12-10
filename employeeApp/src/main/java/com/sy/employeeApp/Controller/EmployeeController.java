package com.sy.employeeApp.Controller;


import com.sy.employeeApp.DTO.EmpCreateDto;
import com.sy.employeeApp.DTO.EmployeeDTO;
import com.sy.employeeApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody EmpCreateDto dto){
        return service.insertEmployee(dto);
    }

    @GetMapping("/{id}")
    public EmployeeDTO getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAll(){
        return service.getAllEmployees();
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id){
         service.deleteEmployee(id);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateAll(@PathVariable Integer id, @RequestBody EmpCreateDto dto){
        return service.updateEmployee(dto, id);
    }

    @PatchMapping("/{id}")
    public EmployeeDTO partiallyUpdate(@PathVariable Integer id, @RequestBody Map<String, Object> update){
        return service.partiallyUpdate(id,update);
    }

}
