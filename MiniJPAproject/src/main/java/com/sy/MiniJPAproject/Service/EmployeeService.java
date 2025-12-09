package com.sy.MiniJPAproject.Service;

import com.sy.MiniJPAproject.Entity.Employee;
import com.sy.MiniJPAproject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee add(Employee e){
        return repo.save(e);
    }

    public List<Employee> getAll(){
        return repo.findAll();
    }

    public Employee getById(Integer id){
        return repo.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

    public Employee updateById(Integer id, Employee e){

        Employee exists = repo.findById(id).orElse(null);

        if(exists!=null){
            exists.setName(e.getName());
            exists.setEmail(e.getEmail());
            exists.setDepartment(e.getDepartment());
            exists.setSalary(e.getSalary());
            exists.setPhone(e.getPhone());
            exists.setDateOfJoining(e.getDateOfJoining());
            return repo.save(exists);
        }
        return null ;
    }

    public Employee partiallyUpdateById(Integer id, Map<String,Object> obj){

        Employee exists = repo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));

        obj.forEach((k,v)->{
            switch (k){
                case "name": exists.setName((String)v);
                            break;
                case "email": exists.setEmail((String)v);
                            break;
                case "department": exists.setDepartment((String)v);
                            break;
                case "salary": exists.setSalary((Double)v);
                            break;
                case "dateOfJoining": exists.setDateOfJoining(LocalDate.parse((String)v));
                            break;
                case "phone": exists.setPhone((Long) v);
                            break;
            }
        });
        return repo.save(exists);
    }

}
