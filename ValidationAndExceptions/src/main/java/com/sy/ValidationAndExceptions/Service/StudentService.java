package com.sy.ValidationAndExceptions.Service;

import com.sy.ValidationAndExceptions.DTO.StudentDTO;
import com.sy.ValidationAndExceptions.Entity.Student;
import com.sy.ValidationAndExceptions.Repository.StudentRepository;
import com.sy.ValidationAndExceptions.Exception.StudentNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    @Autowired
    private ModelMapper mapper ;


    public StudentDTO insert(StudentDTO dto){
        Student s = mapper.map(dto, Student.class);
        return mapper.map(repo.save(s),StudentDTO.class);
    }


    public StudentDTO getById(Integer id){
        Student exists = repo.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with id : "+id));
        return mapper.map(exists,StudentDTO.class);
    }

    public List<StudentDTO> getAll(){
        return repo.findAll().stream()
                .map(emp -> mapper.map(emp,StudentDTO.class))
                .toList();
    }

    public StudentDTO updateById(Integer id, StudentDTO dto){

        Student exists = repo.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with id : "+id));

        exists.setName(dto.getName());
        exists.setAge(dto.getAge());
        exists.setEmail(dto.getEmail());
        exists.setCourse(dto.getCourse());
        exists.setAdmissionDate(dto.getAdmissionDate());

        return mapper.map(repo.save(exists),StudentDTO.class);
    }

    public StudentDTO partiallyUpdateById(Integer id, Map<String,Object> obj){

        Student exists = repo.findById(id).orElseThrow(()->new StudentNotFoundException("Student not found with id : "+id));

        obj.forEach((k,v)->{
            switch (k){
                case "name": exists.setName((String) v);
                break;
                case "age": exists.setAge((Integer) v);
                break;
                case "email": exists.setEmail((String)v);
                break;
                case "course": exists.setCourse((String) v);
                break;
                case "admissionDate": exists.setAdmissionDate(LocalDate.parse((String)v));
                break;
            }
        });

        return mapper.map(repo.save(exists),StudentDTO.class);
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

}
