/*
 * Copyright (C) 2014 University of Nantes
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
public class InterfaceTest {
    
    public InterfaceTest() {
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
     * Test of main method, of class Interface.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Interface.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuNouvelleUnite method, of class Interface.
     */
    @Test
    public void testMenuNouvelleUnite() {
        System.out.println("menuNouvelleUnite");
        Interface.menuNouvelleUnite();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCreerConversion method, of class Interface.
     */
    @Test
    public void testMenuCreerConversion() {
        System.out.println("menuCreerConversion");
        Conversion expResult = null;
        Conversion result = Interface.menuCreerConversion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuConversion method, of class Interface.
     */
    @Test
    public void testMenuConversion() throws Exception {
        System.out.println("menuConversion");
        Interface.menuConversion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saisieIncorrecte method, of class Interface.
     */
    @Test
    public void testSaisieIncorrecte() {
        System.out.println("saisieIncorrecte");
        Interface.saisieIncorrecte();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAllUnit method, of class Interface.
     */
    @Test
    public void testPrintAllUnit() {
        System.out.println("printAllUnit");
        Interface.printAllUnit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifUnitExistence method, of class Interface.
     */
    @Test
    public void testVerifUnitExistence() {
        System.out.println("verifUnitExistence");
        String value = "";
        boolean expResult = false;
        boolean result = Interface.verifUnitExistence(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitByName method, of class Interface.
     */
    @Test
    public void testGetUnitByName() {
        System.out.println("getUnitByName");
        String value = "";
        Unite expResult = null;
        Unite result = Interface.getUnitByName(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialisation method, of class Interface.
     */
    @Test
    public void testInitialisation() {
        System.out.println("initialisation");
        Interface.initialisation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
