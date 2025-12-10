package com.sy.ValidationAndExceptions.Validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CourseValidator.class)
public @interface ValidCourse {

    String message() default "Course must be JAVA, PYTHON, or DEVOPS";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
