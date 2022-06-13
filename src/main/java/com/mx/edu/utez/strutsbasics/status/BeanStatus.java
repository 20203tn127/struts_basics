package com.mx.edu.utez.strutsbasics.status;

public class BeanStatus {

    private int id;
    private String name;


    public BeanStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BeanStatus(String name) {
        this.name = name;
    }

    public BeanStatus() {
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

}
