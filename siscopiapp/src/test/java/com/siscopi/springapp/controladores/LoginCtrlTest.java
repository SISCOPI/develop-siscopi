/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.springapp.controladores;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mary
 */
public class LoginCtrlTest {
    
    public LoginCtrlTest() {
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
     * Test of loginCtrl method, of class LoginCtrl.
     */
    @Test
    public void testLoginCtrl() {
        System.out.println("loginCtrl");
        LoginCtrl instance = new LoginCtrl();
        String expResult = "";
        String result = instance.loginCtrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class LoginCtrl.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        LoginCtrl instance = new LoginCtrl();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class LoginCtrl.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        LoginCtrl instance = new LoginCtrl();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginCtrl.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginCtrl instance = new LoginCtrl();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginCtrl.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginCtrl instance = new LoginCtrl();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class LoginCtrl.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        LoginCtrl instance = new LoginCtrl();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class LoginCtrl.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        LoginCtrl instance = new LoginCtrl();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
