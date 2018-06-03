/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

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
public class TtaquillaTest {
    
    public TtaquillaTest() {
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
     * Test of toString method, of class Ttaquilla.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ttaquilla instance = new Ttaquilla();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vendeEntrada method, of class Ttaquilla.
     */
    @Test
    public void testVendeEntrada() {
        System.out.println("vendeEntrada");
        int idObra = 0;
        int cantidad = 0;
        Obra obrat = null;
        Ttaquilla instance = new Ttaquilla();
        instance.vendeEntrada(idObra, cantidad, obrat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
