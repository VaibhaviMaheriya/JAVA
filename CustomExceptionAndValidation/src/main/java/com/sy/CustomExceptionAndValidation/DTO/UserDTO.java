package com.sy.CustomExceptionAndValidation.DTO;


import com.sy.CustomExceptionAndValidation.Validator.ValidGender;
import com.sy.CustomExceptionAndValidation.Validator.ValidUser;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private Integer id;
    @NotNull
    private String name;
    @Min(18)@Max(40)
    private Integer age;
    @ValidGender
    private Character gender;
    @ValidUser
    private String username;
    @PastOrPresent
    private LocalDate registrationDate;

}
