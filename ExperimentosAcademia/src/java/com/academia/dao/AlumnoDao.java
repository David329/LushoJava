/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao;
import com.academia.bd.ConexionDb;
import com.academia.entidades.Alumno;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antiel
 */
public class AlumnoDao {
    public void agregarAlumno(Alumno alumno)
    {
        Connection conection = null;
        try
        {
            conection = ConexionDb.getConnection();
            conection.setAutoCommit(false);
            StringBuilder query = new StringBuilder();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");            
            String date = sdf.format(alumno.getFechaN());    //FORMAT DEVUELVE UN STRING Y PARSE UN DATE     
            query.append("select * from Alumno where idAlumno = ?");
            PreparedStatement ps = conection.prepareStatement(query.toString());
            ps.setInt(1,alumno.getAlumnoId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                throw new SQLException("El alumno ya ha sido registrado");
            }
            query = new StringBuilder();
            query.append("insert into Alumno(nombre, apellidoPaterno,apellidoMaterno,fechaN,DNI,celular,nCasa,estado) " +
                          "values (?,?,?,?,?,?,?,?)");
            
            ps = conection.prepareCall(query.toString());            
            
            ps.setString(1, alumno.getNombre());
            ps.setString(2,alumno.getApellidoPater());
            ps.setString(3, alumno.getApellidoMater());                                       
            ps.setString(4,date);
            ps.setString(5,alumno.getDni());
            ps.setString(6,alumno.getCelular());
            ps.setString(7, alumno.getnCasa());
            ps.setString(8, "ACT");
            ps.executeUpdate();
            conection.commit();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }catch(Exception e){
            throw new RuntimeException("No se puede acceder al servidor");
            
        }finally{
            try{
                if(conection !=null )
                {
                    conection.close();
                }
            }catch(Exception ex){                
            }
        }   
    }    
    
    
    public void editarAlumno(Alumno alumno)
    {
        Connection cn = null;
        try{
            cn = ConexionDb.getConnection();
            StringBuilder query = new StringBuilder();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");            
            String date = sdf.format(alumno.getFechaN()); 
            query.append("update Alumno set nombre = ?, apellidoPaterno=?,apellidoMaterno=?,fechaN=?, DNI=?,celular =?,nCasa=? where idAlumno=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setString(1,alumno.getNombre());
            ps.setString(2,alumno.getApellidoPater());
            ps.setString(3,alumno.getApellidoMater());
            ps.setString(4, date);
            ps.setString(5, alumno.getDni());
            ps.setString(6, alumno.getCelular());
            ps.setString(7, alumno.getnCasa());
            ps.setInt(8, alumno.getAlumnoId());
            int realizado = ps.executeUpdate();
            if (realizado == 0) {
                throw new SQLException("ERROR");
            }           
            
        }catch (SQLException ex) {
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
    
    
    public Alumno getAlumnoById(String alumnoId)
    {
        Connection conection = null;
        try
        {
            conection = ConexionDb.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("select idAlumno,nombre, apellidoPaterno, apellidoMaterno, fechaN, DNI, celular, nCasa,estado"+
                            " from Alumno where idAlumno = ?");
            PreparedStatement ps = conection.prepareStatement(query.toString());
            ps.setString(1, alumnoId);            
            ResultSet rs = ps.executeQuery();
            rs.next();            
            
            Alumno al = new Alumno();
            
            al.setAlumnoId(rs.getInt("idAlumno"));
            al.setNombre(rs.getString("nombre"));
            al.setApellidoPater(rs.getString("apellidoPaterno"));
            al.setApellidoMater(rs.getString("apellidoMaterno"));
            al.setFechaN(rs.getDate("fechaN"));
            al.setDni(rs.getString("DNI"));
            al.setCelular(rs.getString("celular"));
            al.setnCasa(rs.getString("nCasa"));            
            al.setEstado("estado");
            return al;
            
        } catch (SQLException ex) {
           // return null;
           throw new RuntimeException(ex.getMessage());
        }catch(Exception e){
            throw new RuntimeException("No se puede acceder al servidor");
            
        }finally{
            try{
                if(conection !=null )
                {
                    conection.close();
                }
            }catch(Exception ex){                
            }
        }
        
    }
    
     public void eliminarAlumno(Alumno  alumno) {
        Connection cn = null;
        try {
            cn = ConexionDb.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("update Alumno set estado = ? where idAlumno = ?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setString(1, "INA");
            ps.setInt(2, alumno.getAlumnoId());
                        
            int realizado = ps.executeUpdate();
            if (realizado == 0) {
              throw new SQLException("Alumno no existe!");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
            
        } catch (Exception e) {
            throw new RuntimeException("No se puede acceder al servidor");
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }
    
    
    public List<Alumno> obtenerAlumnos()
    {
        Connection conection = null;
        try{
            List<Alumno> lstAlumnos = new ArrayList<>();
            conection = ConexionDb.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("Select * from Alumno where estado = 'ACT'");
            PreparedStatement ps = conection.prepareStatement(query.toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Alumno al = new Alumno();
                al.setAlumnoId(rs.getInt("idAlumno"));
                al.setNombre(rs.getString("nombre"));
                al.setApellidoPater(rs.getString("apellidoPaterno"));
                al.setApellidoMater(rs.getString("apellidoMaterno"));
                al.setFechaN(rs.getDate("fechaN"));
                al.setDni(rs.getString("DNI"));
                al.setCelular(rs.getString("celular"));
                al.setnCasa(rs.getString("nCasa"));
                
                lstAlumnos.add(al);
            }
            return lstAlumnos;
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }catch(Exception e){
            throw new RuntimeException("No se puede acceder al servidor");
            
        }finally{
            try{
                if(conection !=null )
                {
                    conection.close();
                }
            }catch(Exception ex){                
            }
        }
            
    }
    
    
}
