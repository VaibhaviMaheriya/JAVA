package com.sy.ValidationAndExceptions.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class CourseValidator implements ConstraintValidator<ValidCourse, String> {

    private final List<String> validCourse = List.of("JAVA","PYTHON","DEVOPS");

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return s != null && validCourse.contains(s);
    }
}
