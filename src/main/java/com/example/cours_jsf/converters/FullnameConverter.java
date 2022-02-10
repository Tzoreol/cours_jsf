package com.example.cours_jsf.converters;

import com.example.cours_jsf.dto.UserBean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "fullnameConverter")
public class FullnameConverter implements Converter<UserBean> {
    @Override
    public UserBean getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, UserBean userBean) {
        return userBean.getFirstname() + " " + userBean.getLastname();
    }
}
