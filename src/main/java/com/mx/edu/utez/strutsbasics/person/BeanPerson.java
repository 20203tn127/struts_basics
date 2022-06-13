package com.mx.edu.utez.strutsbasics.person;

import com.mx.edu.utez.strutsbasics.rol.BeanRol;
import com.mx.edu.utez.strutsbasics.status.BeanStatus;

import java.util.List;

public class BeanPerson {
    private int id;
    private String name;
    private String surname;
    private String lastname;
    private String birthday;
    private String phone;

    public BeanPerson(int id, String name, String surname, String lastname, String birthday, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.phone = phone;
    }

    public BeanPerson(String name, String surname, String lastname, String birthday, String phone) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.phone = phone;
    }

    public BeanPerson() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

