


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao;
import com.academia.entidades.Admin;
import com.academia.bd.ConexionDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author antiel
 */
public class adminDao {
    
   public boolean validarLoginAdmin(Admin objAdmin) {
        Connection cn = null;
        try {
            cn = ConexionDb.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT * FROM admin WHERE usuario = ? AND contraseña = ?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setString(1, objAdmin.getUsuario());
            ps.setString(2, objAdmin.getContraseña());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }
    
}
