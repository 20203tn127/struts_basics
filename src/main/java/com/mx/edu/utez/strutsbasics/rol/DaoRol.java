package com.mx.edu.utez.strutsbasics.rol;

import com.mx.edu.utez.strutsbasics.status.BeanStatus;
import com.mx.edu.utez.strutsbasics.utils.ConnectionMySQL;
import org.apache.struts2.components.Bean;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoRol {
    Connection connection;
    PreparedStatement pstm;
    ResultSet rs;
    public boolean createRol(BeanRol rol) throws SQLException {
        boolean status = false;
        try{
            connection = ConnectionMySQL.getConnection();
            String script = "INSERT INTO rol (name, Status_id) VALUES (?,?)";
            pstm = connection.prepareStatement(script);
            pstm.setString(1,rol.getName());
            pstm.setInt(2,rol.getStatus().getId());
            status = pstm.executeUpdate() == 1;

        }catch (SQLException e){
            e.getErrorCode();
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return status;
    }
    public List<BeanRol> findAllRoles() throws SQLException {
        List<BeanRol> roles = new ArrayList<>();
        try{
            connection = ConnectionMySQL.getConnection();
            String script = "Select rol.id, rol.name, status.id as id_status, status.name as " +
                    "name_status from rol inner join status on status.id = rol.Status_id;";
            pstm = connection.prepareStatement(script);
            rs = pstm.executeQuery();
            while (rs.next()){
                roles.add(new BeanRol(
                        rs.getInt("id"),
                        rs.getString("name"),
                        new BeanStatus(
                                rs.getInt("id"),
                                rs.getString("name_status")
                        )
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return roles;
    }

    public boolean updateRol(BeanRol rol){
        boolean status = false;
        try{
        connection  = ConnectionMySQL.getConnection();
        String script = "UPDATE rol SET `name` = ?,`Status_id` = ?  WHERE (`id` = ?);";
        pstm = connection.prepareStatement(script);
        pstm.setString(1,rol.getName());
        pstm.setInt(2,rol.getStatus().getId());
        pstm.setInt(3,rol.getId());
        status = pstm.executeUpdate() == 1;

        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
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
//       BeanStatus status = new BeanStatus(1,"Activo");
        DaoRol Daorol = new DaoRol();
//        BeanRol bean1 = new BeanRol("Administrador",status);
//        BeanRol bean2 = new BeanRol("Cliente",status);
//
////        if (Daorol.createRol(bean2)){
////                System.out.println("Exitoso");
////        }else {
////            System.out.println("Error");
////        }
//
//        System.out.println("actualizar.................");
//
//        BeanRol rolUpdate = new BeanRol();
//        rolUpdate.setId(5);
//        rolUpdate.setName("AngelActualizado");
//        rolUpdate.setStatus(status);
//        if (Daorol.updateRol(rolUpdate)){
//            System.out.println("siu");
//        }else {
//            System.out.println("nanais");
//        }
        for (BeanRol rol : Daorol.findAllRoles()){
            System.out.println("//datos//");
            System.out.println(rol.getId());
            System.out.println(rol.getName());
            System.out.println(rol.getStatus().getName());
        }
        
    }

}
