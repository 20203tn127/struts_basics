package com.mx.edu.utez.strutsbasics.user;

import com.mx.edu.utez.strutsbasics.person.BeanPerson;
import com.mx.edu.utez.strutsbasics.rol.BeanRol;
import com.mx.edu.utez.strutsbasics.status.BeanStatus;

import java.util.List;

public class BeanUser {

    private int id;
    private String email;
    private String password;
    private String createAt;
    private BeanStatus status;
    private List<BeanRol> rols;

    private BeanPerson person;


    public BeanUser() {
    }

    public BeanUser(int id, String email, String password, String createAt, BeanStatus status, List<BeanRol> rols, BeanPerson person) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.createAt = createAt;
        this.status = status;
        this.rols = rols;
        this.person = person;
    }

    public BeanUser(String email, String password, String createAt, BeanStatus status, List<BeanRol> rols, BeanPerson person) {
        this.email = email;
        this.password = password;
        this.createAt = createAt;
        this.status = status;
        this.rols = rols;
        this.person = person;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public BeanStatus getStatus() {
        return status;
    }

    public void setStatus(BeanStatus status) {
        this.status = status;
    }

    public List<BeanRol> getRols() {
        return rols;
    }

    public void setRols(List<BeanRol> rols) {
        this.rols = rols;
    }
}
