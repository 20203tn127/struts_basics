package com.mx.edu.utez.strutsbasics.status;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActionStatus extends ActionSupport {

private List<BeanStatus> listStatus  = new ArrayList<>();
private String message;
private BeanStatus beanStatus;

public String findAllStatus() throws SQLException {
    setListStatus(new DaoStatus().findAll());
    return  SUCCESS;
}












    public List<BeanStatus> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<BeanStatus> listStatus) {
        this.listStatus = listStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BeanStatus getBeanStatus() {
        return beanStatus;
    }

    public void setBeanStatus(BeanStatus beanStatus) {
        this.beanStatus = beanStatus;
    }
}
