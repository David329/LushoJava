/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author antiel
 */
public class ConexionDb {
    
    public static Connection getConnection()throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/Academia";
            return DriverManager.getConnection(url,"root","rootM");
        }catch(SQLException e){
             throw new RuntimeException(e);
        }          
        
        
    }
    
}
