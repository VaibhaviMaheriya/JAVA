package com.sy.employeeApp.Service;


import com.sy.employeeApp.DTO.EmpCreateDto;
import com.sy.employeeApp.DTO.EmployeeDTO;
import com.sy.employeeApp.Entity.EmployeeEntity;
import com.sy.employeeApp.Repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private ModelMapper mapper;


    public EmployeeDTO insertEmployee(EmpCreateDto dto){
        EmployeeEntity emp = mapper.map(dto, EmployeeEntity.class);
        return mapper.map(repo.save(emp), EmployeeDTO.class);
    }

    public EmployeeDTO getById(Integer id){

        EmployeeEntity exists = repo.findById(id).orElse(null);
        return mapper.map(exists, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees(){
        return repo.findAll().stream()
                .map(emp -> mapper.map(emp, EmployeeDTO.class))
                .toList();
    }

    public EmployeeDTO  updateEmployee(EmpCreateDto dto,Integer id){

        EmployeeEntity exists = repo.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));

        exists.setName(dto.getName());
        exists.setSalary(dto.getSalary());
        exists.setDepartment(dto.getDepartment());
        exists.setPassword(dto.getPassword());

        return mapper.map(repo.save(exists), EmployeeDTO.class);

    }

    public EmployeeDTO partiallyUpdate(Integer id, Map<String,Object> update){

        EmployeeEntity exists = repo.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));

        update.forEach((k,v)->{
            switch (k){
                case "name":exists.setName((String) v);
                break;
                case "salary":exists.setSalary((Double) v);
                break;
                case "department":exists.setDepartment((String) v);
                break;
                case "password":exists.setPassword((String) v);
            }
        });

        return mapper.map(repo.save(exists), EmployeeDTO.class);
    }

    public void deleteEmployee(Integer id){
        repo.deleteById(id);
    }


}
