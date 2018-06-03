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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of compraEntrada method, of class Cliente.
     */
    @Test
    public void testCompraEntrada() {
        System.out.println("compraEntrada");
        int idObra = 0;
        int cantidad = 0;
        Obra obrat = null;
        Cliente instance = new Cliente();
        instance.compraEntrada(idObra, cantidad, obrat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reservaEntradas method, of class Cliente.
     */
    @Test
    public void testReservaEntradas() {
        System.out.println("reservaEntradas");
        int idObra = 0;
        int cantidad = 0;
        Obra obrat = null;
        Cliente instance = new Cliente();
        instance.reservaEntradas(idObra, cantidad, obrat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
