/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao;

import com.academia.entidades.Alumno;
import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlumnoDaoTest {

    public AlumnoDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addAlumno method, of class AlumnoDao.
     */
    @Test
    public void testAgregarAlumno() {
        /*try {
            System.out.println("Agregar alumno");
            
            Alumno alumno = new Alumno();
            alumno.setEstado("ACT");
            alumno.setNombre("Test");
            alumno.setApellidoPater("Test");
            alumno.setApellidoMater("Test");
            alumno.setDni("5534333");
            alumno.setCelular("9494949");
            alumno.setnCasa("333349");            
            String f = "2016/10/11";
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Date dateFormatter = (Date)df.parse(f);
           // Date nue = new Date();//((java.sql.Date)dateFormatter)            
            alumno.setFechaN(dateFormatter);   
            
            AlumnoDao instance = new AlumnoDao();
            instance.agregarAlumno(alumno);
            assertEquals(instance.obtenerAlumnos().size(),5 );
            
        } catch (ParseException ex) {
            Logger.getLogger(AlumnoDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    */}
    
    @Test
    public void testEditarAlumno()
    {
        /*try {
            System.out.println("Agregar alumno");
            
            Alumno alumno = new Alumno();
            alumno.setAlumnoId(9);
            alumno.setEstado("ACT");
            alumno.setNombre("Testiando");
            alumno.setApellidoPater("Testiando");
            alumno.setApellidoMater("Testiando");
            alumno.setDni("5534333");
            alumno.setCelular("9494949");
            alumno.setnCasa("333349");            
            String f = "2016/10/11";
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Date dateFormatter = (Date)df.parse(f);           
            alumno.setFechaN(dateFormatter); 
            AlumnoDao instance = new AlumnoDao();
            instance.editarAlumno(alumno);
            assertEquals(instance.obtenerAlumnos().size(),9 );
            
        } catch (ParseException ex) {
            Logger.getLogger(AlumnoDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    */}

    /**
     * Test of getAlumnoById method, of class AlumnoDao.
     */
    @Test
    public void testGetAlumnoById() {
        /*
        System.out.println("Obtener Alumno por ID");
        String alumnoId = "1";
        AlumnoDao instance = new AlumnoDao();
        Alumno result = instance.getAlumnoById(alumnoId);
        String nombr = result.getNombre();
        assertEquals("LUO", nombr);        */
    }

    /**
     * Test of eliminarAlumno method, of class AlumnoDao.
     */
    @Test
    public void testEliminarAlumno() {
       /* try {
            System.out.println("eliminarAlumno");
            Alumno alumno = new Alumno();
            
            alumno.setAlumnoId(1);
            alumno.setNombre("LUO");            
            alumno.setApellidoMater("Veliz");
            alumno.setApellidoPater("Veliz");            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");            
            Date date = sdf.parse("1000/10/10");            
            
            alumno.setFechaN(date);
            alumno.setEstado("ACT");
            alumno.setDni("234560");
            alumno.setCelular("984388890");
            alumno.setnCasa("5553923");                        
                                   
            System.out.println(alumno.getAlumnoId());
            
            AlumnoDao instance = new AlumnoDao();
            instance.eliminarAlumno(alumno);
            List<Alumno> listaAl = instance.obtenerAlumnos();
            assertEquals(listaAl.size(), 4);
            
        } catch (ParseException ex) {
            Logger.getLogger(AlumnoDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
    }

    /**
     * Test of obtenerAlumnos method, of class AlumnoDao.
     */
    @Test
    public void testObtenerAlumnos() {
        /*
        System.out.println("obtenerAlumnos");
        AlumnoDao instance = new AlumnoDao();
        List<Alumno> expResult = instance.obtenerAlumnos();
        assertEquals(expResult.size(), 5);*/
    }

}
