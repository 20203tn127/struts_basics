package com.mx.edu.utez.strutsbasics.status;

import com.mx.edu.utez.strutsbasics.utils.ConnectionMySQL;
import org.apache.struts2.components.Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoStatus {
    Connection connection;
    ResultSet rs;
    PreparedStatement pstm;

    public List<BeanStatus> findAll() throws SQLException {
        List<BeanStatus> listStatus = new ArrayList<>();
        try{
            connection = ConnectionMySQL.getConnection();
            String script = "Select status.id, status.name from status;";
            pstm = connection.prepareStatement(script);
            rs = pstm.executeQuery();
            while (rs.next()){
                BeanStatus status = new BeanStatus();
                status.setId(rs.getInt("id"));
                status.setName(rs.getString("name"));
                listStatus.add(status);
            }
            return listStatus;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            closeConnection();
        }
        return listStatus;
    }

    private void closeConnection() throws SQLException {
        if (rs!=null){
            rs.close();
        }
        if (pstm!=null){
            pstm.close();
        }
        if (connection!=null){
            connection.close();
        }
    }


    public static void main(String[] args) throws SQLException {
        DaoStatus dao = new DaoStatus();
        for (BeanStatus status: dao.findAll()){
            System.out.println("Datos OG");
            System.out.println(status.getId());
            System.out.println(status.getName());
        }
    }






}
