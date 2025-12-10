package com.sy.CustomExceptionAndValidation.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class UsernameValidator implements ConstraintValidator<ValidUser,String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {

        if(s == null || s.isEmpty())
            return false;

        for (char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)|| ch == '_'){
                continue;
            }
            return false;
        }
        return true;
    }
}
