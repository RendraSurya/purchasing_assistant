/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows 10
 */
public class warehouseTest {
    warehouse instance = new warehouse("ML9421", "Mouse Logitech", 2);
    public warehouseTest() {
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
     * Test of getItemID method, of class warehouse.
     */
    @Test
    public void testGetItemID() {
        String expResult = "ML9421";
        String result = instance.getItemID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemID method, of class warehouse.
     */
    @Test
    public void testSetItemID() {
        String itemID = "ML9421";
        instance.setItemID(itemID);
    }

    /**
     * Test of getItemName method, of class warehouse.
     */
    @Test
    public void testGetItemName() {
        
        String expResult = "Mouse Logitech";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class warehouse.
     */
    @Test
    public void testSetItemName() {
        String itemName = "Keyboard Asus";
        instance.setItemName(itemName);
    }

    /**
     * Test of getEndingStock method, of class warehouse.
     */
    @Test
    public void testGetEndingStock() {
        int expResult = 2;
        int result = instance.getEndingStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEndingStock method, of class warehouse.
     */
    @Test
    public void testSetEndingStock() {
        int endingStock = 3;
        instance.setEndingStock(endingStock);
    }
    
}
