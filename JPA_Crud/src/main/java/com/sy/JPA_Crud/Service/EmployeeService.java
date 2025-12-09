package com.sy.JPA_Crud.Service;


import com.sy.JPA_Crud.Entity.Employee;
import com.sy.JPA_Crud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee e){
        return repo.save(e);
    }

    public List<Employee> getAll(){
        return repo.findAll();
    }

    public Employee getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }


    public Employee update(Integer id ,Employee e){
        Employee exists = repo.findById(id).orElse(null);

        if(exists!=null){
            exists.setName(e.getName());
            exists.setEmail(e.getEmail());
            return repo.save(exists);
        }
        return null;
    }

    public List<Employee> searchByNameOrEmail(String name, String email){
        return  repo.findByNameOrEmail(name,email);
    }





}
