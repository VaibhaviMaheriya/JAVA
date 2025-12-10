package com.sy.CustomExceptionAndValidation.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<ValidGender, Character> {


    @Override
    public boolean isValid(Character ch, ConstraintValidatorContext context) {

        if (ch == null) return false;

        ch = Character.toUpperCase(ch);
        return ch == 'M' || ch == 'F' || ch == 'O';
    }
}
