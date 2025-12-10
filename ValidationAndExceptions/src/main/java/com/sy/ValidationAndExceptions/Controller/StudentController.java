package com.sy.ValidationAndExceptions.Controller;


import com.sy.ValidationAndExceptions.DTO.StudentDTO;
import com.sy.ValidationAndExceptions.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public ResponseEntity<StudentDTO> add(@Valid @RequestBody StudentDTO dto){

        StudentDTO save = service.insert(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> update(@PathVariable Integer id,@Valid @RequestBody StudentDTO dto){
        return ResponseEntity.ok(service.updateById(id,dto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDTO> partiallyUpdate(@PathVariable Integer id, @RequestBody Map<String,Object> update){
        return ResponseEntity.ok(service.partiallyUpdateById(id,update));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        service.deleteById(id);
        return ResponseEntity.ok("Data deleted successfully");
    }

}
