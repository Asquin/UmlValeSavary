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
public class ConversionTest {
    
    public ConversionTest() {
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
     * Test of calculateToEtalon method, of class Conversion.
     */
    @Test
    public void testCalculateToEtalon() {
        System.out.println("calculateToEtalon");
        double val_dep = 0.0;
        Conversion instance = null;
        double expResult = 0.0;
        double result = instance.calculateToEtalon(val_dep);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFromEtalon method, of class Conversion.
     */
    @Test
    public void testCalculateFromEtalon() {
        System.out.println("calculateFromEtalon");
        double val_dep = 0.0;
        Conversion instance = null;
        double expResult = 0.0;
        double result = instance.calculateFromEtalon(val_dep);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Conversion.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Conversion instance = null;
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
