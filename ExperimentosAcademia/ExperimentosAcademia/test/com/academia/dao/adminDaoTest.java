/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao;

import com.academia.entidades.Admin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antiel
 */
public class adminDaoTest {
    
    public adminDaoTest() {
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
     * Test of validarLoginAdmin method, of class adminDao.
     */
    @Test
    public void testValidarLoginAdmin() {
        System.out.println("validarLoginAdmin");
        Admin objAdmin = new Admin();
        objAdmin.setUsuario("''12334");
        objAdmin.setContraseña("5959$##$%%%");
        adminDao instance = new adminDao();
                        
        boolean expResult = false;
        boolean result = instance.validarLoginAdmin(objAdmin);
        assertEquals(expResult, result);
    }
    
}
