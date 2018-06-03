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
public class ValidarFechaTest {
    
    public ValidarFechaTest() {
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
     * Test of validaDia method, of class ValidarFecha.
     */
    @Test
    public void testValidaDia() throws Exception {
        System.out.println("validaDia");
        int di = 0;
        int expResult = 0;
        int result = ValidarFecha.validaDia(di);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaMes method, of class ValidarFecha.
     */
    @Test
    public void testValidaMes() throws Exception {
        System.out.println("validaMes");
        int me = 0;
        int expResult = 0;
        int result = ValidarFecha.validaMes(me);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
