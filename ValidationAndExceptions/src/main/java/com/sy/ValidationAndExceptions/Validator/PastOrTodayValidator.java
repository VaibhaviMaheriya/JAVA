package com.sy.ValidationAndExceptions.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;


public class PastOrTodayValidator implements ConstraintValidator<PastOrToday, LocalDate> {

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext context) {
        return date != null && date.isBefore(LocalDate.now());
    }
}
