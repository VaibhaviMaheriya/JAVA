package com.sy.ValidationAndExceptions.Validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PastOrTodayValidator.class)
public @interface PastOrToday {

    String message() default "Admission Date can't be Future";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
