/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.miage.logiciel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mathilde
 */
public class AdditionTest {
    
    public AdditionTest() {
        //bouh !
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
     * Test of getValeur method, of class Addition.
     */
    @org.junit.Test
    public void testGetValeur() {
        System.out.println("getValeur");
        Addition instance = null;
        double expResult = 0.0;
        double result = instance.getValeur();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValeur method, of class Addition.
     */
    @org.junit.Test
    public void testSetValeur() {
        System.out.println("setValeur");
        double valeur = 0.0;
        Addition instance = null;
        instance.setValeur(valeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class Addition.
     */
    @org.junit.Test
    public void testCalculate() {
        System.out.println("calculate");
        double val_dep = 0.0;
        Addition instance = null;
        double expResult = 0.0;
        double result = instance.calculate(val_dep);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateInverse method, of class Addition.
     */
    @org.junit.Test
    public void testCalculateInverse() {
        System.out.println("calculateInverse");
        double val_dep = 0.0;
        Addition instance = null;
        double expResult = 0.0;
        double result = instance.calculateInverse(val_dep);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Addition.
     */
    @org.junit.Test
    public void testPrint() {
        System.out.println("print");
        Addition instance = null;
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
