package com.sy.CustomExceptionAndValidation.Service;

import com.sy.CustomExceptionAndValidation.DTO.UserDTO;
import com.sy.CustomExceptionAndValidation.Entity.User;
import com.sy.CustomExceptionAndValidation.Exception.UserNotfoundException;
import com.sy.CustomExceptionAndValidation.Repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private ModelMapper mapper;

    public UserDTO insert(UserDTO user){

        User save = repo.save(mapper.map(user,User.class));
        return mapper.map(save, UserDTO.class);
    }

    public UserDTO getById(Integer id){
        User exists = repo.findById(id).orElseThrow(()->new UserNotfoundException("User not found with id : "+id));

        return mapper.map(exists, UserDTO.class);
    }

    public List<UserDTO> getAll(){
        return repo.findAll().stream()
                .map(user -> mapper.map(user,UserDTO.class)).toList();
    }

    public UserDTO updateAll(Integer id ,UserDTO dto){

        User exists = repo.findById(id).orElseThrow(()->new UserNotfoundException("User not found with id : "+id));

        exists.setName(dto.getName());
        exists.setAge(dto.getAge());
        exists.setGender(dto.getGender());
        exists.setUsername(dto.getUsername());
        exists.setRegistrationDate(dto.getRegistrationDate());

        return mapper.map(repo.save(exists),UserDTO.class);
    }

    public UserDTO partiallyUpdate(Integer id, Map<String, Object> obj){

        User exists = repo.findById(id).orElseThrow(()->new UserNotfoundException("User not found with id : "+id));

        obj.forEach((k,v)->{
            switch (k){
                case "name": exists.setName((String) v);break;
                case "age": exists.setAge((Integer) v);break;
                case "gender": exists.setGender((Character) v);break;
                case "username": exists.setUsername((String) v);break;
                case "registrationDate": exists.setRegistrationDate(LocalDate.parse((String)v));
            }
        });
        return mapper.map(repo.save(exists),UserDTO.class);
    }


    public void delete(Integer id){
        repo.deleteById(id);
    }

}
