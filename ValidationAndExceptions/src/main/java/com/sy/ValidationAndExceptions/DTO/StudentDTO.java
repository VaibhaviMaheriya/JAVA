package com.sy.ValidationAndExceptions.DTO;


import com.sy.ValidationAndExceptions.Validator.PastOrToday;
import com.sy.ValidationAndExceptions.Validator.ValidCourse;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDTO {

    private String id;

    @NotNull(message = "Name cannot be blank")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Min(value = 18, message = "Age must be at least 18 ")
    @Max(value = 60, message = "Age must not exceed 60")
    private Integer age;

    @ValidCourse
    private String course;

    @PastOrToday
    private LocalDate admissionDate;

}
