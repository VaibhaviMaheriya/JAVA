package com.sy.CustomExceptionAndValidation.Controller;

import com.sy.CustomExceptionAndValidation.DTO.UserDTO;
import com.sy.CustomExceptionAndValidation.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> addUser(@Valid @RequestBody UserDTO dto) {
        UserDTO save = service.insert(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id, @Valid @RequestBody UserDTO dto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateAll(id,dto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserDTO> partiallyUpdate(@PathVariable Integer id, @RequestBody Map<String,Object> obj){

        return ResponseEntity.status(HttpStatus.OK).body(service.partiallyUpdate(id,obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("User deleted Successfully");
    }


}
