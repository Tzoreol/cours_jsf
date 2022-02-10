package com.example.cours_jsf.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("checkLogin")
public class LoginValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
       if(o == null || !o.toString().equals("admin")) {
           throw new ValidatorException(new FacesMessage("Identifiant inconnu"));
       }
    }
}
