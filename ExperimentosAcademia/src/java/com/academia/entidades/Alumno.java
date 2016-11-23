/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.entidades;

import java.util.Date;

/**
 *
 * @author antiel
 */
public class Alumno {
    private int alumnoId;
    private String estado;
    private String nombre;
    private String apellidoPater;
    private String apellidoMater;
    private Date fechaN;
    private String dni;
    private String celular;
    private String nCasa;

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPater() {
        return apellidoPater;
    }

    public void setApellidoPater(String apellidoPater) {
        this.apellidoPater = apellidoPater;
    }

    public String getApellidoMater() {
        return apellidoMater;
    }

    public void setApellidoMater(String apellidoMater) {
        this.apellidoMater = apellidoMater;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }
    
    
}
