package com.mx.edu.utez.strutsbasics.rol;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActionRol extends ActionSupport {
    private String message;
    private List<BeanRol> listRoles = new ArrayList<>();
    private String data;
    private BeanRol rol;

    public String findAllRoles() throws SQLException {
        setListRoles(new DaoRol().findAllRoles());
        return SUCCESS;
    }

    public String createRol() throws SQLException {
        rol = new Gson().fromJson(data,BeanRol.class);
        if (new DaoRol().createRol(rol)){
             setMessage("Registro successful");
        }else{
            setMessage("Fail");
        }
        return SUCCESS;
    }

    public static void main(String[] args) {

    }


    public BeanRol getRol() {
        return rol;
    }

    public void setRol(BeanRol rol) {
        this.rol = rol;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BeanRol> getListRoles() {
        return listRoles;
    }

    public void setListRoles(List<BeanRol> listRoles) {
        this.listRoles = listRoles;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
