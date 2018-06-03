/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class TrabajadorTest {
    
    public TrabajadorTest() {
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
     * Test of getFechaNacimiento method, of class Trabajador.
     */
    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Trabajador instance = new Trabajador();
        Calendar expResult = null;
        Calendar result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatoFechaNaci method, of class Trabajador.
     */
    @Test
    public void testFormatoFechaNaci() {
        System.out.println("formatoFechaNaci");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.formatoFechaNaci();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatoFechaIngreso method, of class Trabajador.
     */
    @Test
    public void testFormatoFechaIngreso() {
        System.out.println("formatoFechaIngreso");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.formatoFechaIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Trabajador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trabajador instance = new Trabajador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
